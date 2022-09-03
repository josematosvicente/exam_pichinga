package com.bootcamp.springwebflux.msvcaccount.services;

import com.bootcamp.springwebflux.msvcaccount.models.documents.BankAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BankAccountService {

    public Flux<BankAccount> findAll();
    public Mono<BankAccount> findById(String id);
    public Mono<BankAccount> save(BankAccount bankAccount);
    public Mono<Void> delete (BankAccount bankAccount);

}
