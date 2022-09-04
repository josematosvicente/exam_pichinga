package com.bootcamp.springwebflux.msvcclient.controllers;

import com.bootcamp.springwebflux.msvcclient.api.ClientsApi;
import com.bootcamp.springwebflux.msvcclient.mapper.Mapper;
import com.bootcamp.springwebflux.msvcclient.models.ClientDTO;
import com.bootcamp.springwebflux.msvcclient.models.NewClientDTO;
import com.bootcamp.springwebflux.msvcclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
public class ClientController implements ClientsApi {

    @Autowired
    private ClientService clientService;

    @Autowired
    private Mapper mapper;

    @Override
    public Mono<ResponseEntity<ClientDTO>> addClient(Mono<NewClientDTO> newClient, ServerWebExchange exchange) {
        return newClient.flatMap(newClientDTO -> clientService.save(mapper.toClient(newClientDTO)))
                .map(client ->
                        ResponseEntity.created(URI.create("/api/client/".concat(client.getId())))
                                .contentType(MediaType.APPLICATION_JSON)
                                .body(mapper.toDto(client)));

    }

    @Override
    public Mono<ResponseEntity<Void>> deleteClient(String id, ServerWebExchange exchange) {
        return clientService.findById(id).flatMap(client -> {
            return clientService.delete(client).then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)));
        }).defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
    }

    @Override
    public Mono<ResponseEntity<ClientDTO>> findClientById(String id, ServerWebExchange exchange) {
        return clientService.findById(id).map(client -> ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(mapper.toDto(client))
        ).defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Flux<ClientDTO>>> findClients(ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(clientService.findAll().map(mapper::toDto)));
    }

}
