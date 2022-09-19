package com.bootcamp.springwebflux.msvcfinancial.controllers;

import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

import com.bootcamp.springwebflux.msvcfinancial.models.documents.Movement;
import com.bootcamp.springwebflux.msvcfinancial.services.FinancialAccountService;
import com.msvc.specification.api.dto.AccountDto;

import reactor.core.publisher.Mono;

public class FinancialAccountControllerTest {

    @Autowired
    private WebTestClient webClient;

    @MockBean
    FinancialAccountService financialAccountService;

    @Test
    void testBalanceAccount() {

    }

    @Test
    void testBalanceCredit() {

    }

    @Test
    void testMovement() {
        // Movement movement = new Movement();
        // movement.setAmount(Double.valueOf(100));
        // movement.setType("DEPOSIT");
        // movement.setId("632767dfb8cc775d5e1f5743");

        // AccountDto accountDto = new AccountDto();
        // accountDto.setBalance(Double.valueOf(100));

        
    
        // Mockito.when(financialAccountService.save("632767dfb8cc775d5e1f5743", movement))
        //     .thenReturn(Mono.just(accountDto));
    
        // webClient.post()
        // .uri("/create")
        // .contentType(MediaType.APPLICATION_JSON)
        // .body(BodyInserters.fromObject(movement))
        // .exchange()
        // .expectStatus().isCreated();
    
        // Mockito.verify(financialAccountService, times(1)).save("632767dfb8cc775d5e1f5743", movement);
    }

    @Test
    void testMovementCredit() {

    }
}
