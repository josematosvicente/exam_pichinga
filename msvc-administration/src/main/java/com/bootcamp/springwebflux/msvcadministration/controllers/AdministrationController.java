package com.bootcamp.springwebflux.msvcadministration.controllers;

import com.msvc.specification.api.AdministrativeApi;
import com.msvc.specification.api.dto.AdministrativeAccountDto;
import com.msvc.specification.api.dto.CreditDto;
import com.msvc.specification.api.dto.NewAdministrativeAccountDto;
import com.msvc.specification.api.dto.NewCreditDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AdministrationController implements AdministrativeApi {
    @Override
    public Mono<ResponseEntity<AdministrativeAccountDto>> addAccount(Mono<NewAdministrativeAccountDto> newAdministrativeAccountDto, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<CreditDto>> addCredit(Mono<NewCreditDto> newCreditDto, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteAccount(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteCredit(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<AdministrativeAccountDto>> findAccountById(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Flux<AdministrativeAccountDto>>> findAccounts(ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<CreditDto>> findCreditById(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Flux<CreditDto>>> findCredits(ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> updateAccount(String id, Mono<AdministrativeAccountDto> administrativeAccountDto, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> updateCredit(String id, Mono<CreditDto> creditDto, ServerWebExchange exchange) {
        return null;
    }
}
