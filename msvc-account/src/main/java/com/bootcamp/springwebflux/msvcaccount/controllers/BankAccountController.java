package com.bootcamp.springwebflux.msvcaccount.controllers;

import com.bootcamp.springwebflux.msvcaccount.dto.BankAccountDto;
import com.bootcamp.springwebflux.msvcaccount.mapper.AccountMapper;
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

    @Autowired
    AccountMapper accountMapper;

    @GetMapping
    public Flux<BankAccountDto> getAll() {
        // return accountMapper.mapFluxToDto(bankAccountService.findAll());
        return bankAccountService.findAll().map(t -> accountMapper.mapToDto(t));
    }

    @GetMapping("/{id}")
    public Mono<BankAccountDto> getId(@PathVariable String id) {
        return bankAccountService.findById(id)
                .map(ba -> accountMapper.mapToDto(ba));
    }

    @PostMapping
    public Mono<BankAccountDto> create(@RequestBody BankAccount bankAccount) {
        if (bankAccount.getCreateAt() == null) {
            bankAccount.setCreateAt(new Date());
        }
        return bankAccountService.save(bankAccount).map(ba -> 
            accountMapper.mapToDto(ba));
    }



}
