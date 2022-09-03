package com.bootcamp.springwebflux.msvcaccount.controllers;

import com.bootcamp.springwebflux.msvcaccount.api.PetApi;
import com.bootcamp.springwebflux.msvcaccount.models.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PetController implements PetApi {

    @Override
    public Mono<ResponseEntity<Void>> addPet(Mono<Pet> pet, ServerWebExchange exchange) {
        return Mono.empty(); // TODO: IMPLEMENTATION PENDING
    }

    @Override
    public Mono<ResponseEntity<Flux<Pet>>> getPets(ServerWebExchange exchange) {
        return Mono.empty(); // TODO: IMPLEMENTATION PENDING
    }
}