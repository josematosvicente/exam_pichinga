package com.bootcamp.springwebflux.msvcaccount.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.springwebflux.msvcaccount.mapper.AccountMapper;
import com.bootcamp.springwebflux.msvcaccount.models.dao.BankAccountDao;
import com.bootcamp.springwebflux.msvcaccount.models.documents.BankAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BankAccountImpl implements BankAccountService {

    @Autowired
    private BankAccountDao bankAccountDao;
    
    @Override
    public Flux<BankAccount> findAll() {
        return bankAccountDao.findAll();
    }

    @Override
    public Mono<BankAccount> findById(String id) {
        return bankAccountDao.findById(id);
    }

    @Override
    public Mono<BankAccount> save(BankAccount bankAccount) {
        return bankAccountDao.save(bankAccount);
    }

    @Override
    public Mono<Void> delete(BankAccount bankAccount) {
        return bankAccountDao.delete(bankAccount);
    }
}
