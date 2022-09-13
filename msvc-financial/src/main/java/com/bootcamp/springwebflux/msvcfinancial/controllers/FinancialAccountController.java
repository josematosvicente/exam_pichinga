package com.bootcamp.springwebflux.msvcfinancial.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

import com.msvc.specification.api.FinantialApi;
import com.msvc.specification.api.dto.AccountDto;
import com.msvc.specification.api.dto.MovementDto;

import reactor.core.publisher.Mono;

@RestController
public class FinancialAccountController implements FinantialApi{

    @Override
    public Mono<ResponseEntity<AccountDto>> balanceAccount(String arg0, @Valid Mono<AccountDto> arg1,
            ServerWebExchange arg2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<ResponseEntity<AccountDto>> balanceCredit(String arg0, @Valid Mono<AccountDto> arg1,
            ServerWebExchange arg2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<ResponseEntity<AccountDto>> movement(String arg0, @Valid Mono<MovementDto> arg1,
            ServerWebExchange arg2) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<ResponseEntity<AccountDto>> movementCredit(String arg0, @Valid Mono<MovementDto> arg1,
            ServerWebExchange arg2) {
        // TODO Auto-generated method stub
        return null;
    }

}
