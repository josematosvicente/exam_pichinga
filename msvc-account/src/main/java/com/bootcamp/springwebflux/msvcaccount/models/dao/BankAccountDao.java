package com.bootcamp.springwebflux.msvcaccount.models.dao;

import com.bootcamp.springwebflux.msvcaccount.models.documents.BankAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BankAccountDao extends ReactiveMongoRepository<BankAccount, String> {
}
