package com.bootcamp.springwebflux.msvcaccount.controllers;

import com.bootcamp.springwebflux.msvcaccount.models.documents.BankAccount;
import com.bootcamp.springwebflux.msvcaccount.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Date;

@RestController
@RequestMapping("/api/bankAccount")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping
    public Flux<BankAccount> getAll() {
        return bankAccountService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<BankAccount>> getId(@PathVariable String id) {
        return bankAccountService.findById(id)
                .map(ba -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                        .body(ba))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<ResponseEntity<BankAccount>> create(@RequestBody BankAccount bankAccount) {
        if (bankAccount.getCreateAt() == null) {
            bankAccount.setCreateAt(new Date());
        }

        return bankAccountService.save(bankAccount).map(ba -> ResponseEntity
                .created(URI.create("/api/bankAccount/".concat(ba.getId())))
                .contentType(MediaType.APPLICATION_JSON)
                .body(ba));
    }



}
