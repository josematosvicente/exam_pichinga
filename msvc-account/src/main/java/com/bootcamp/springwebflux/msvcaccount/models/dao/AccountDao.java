package com.bootcamp.springwebflux.msvcaccount.models.dao;

import com.bootcamp.springwebflux.msvcaccount.models.documents.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountDao extends ReactiveMongoRepository <Account, String> {
}
