package com.bootcamp.springwebflux.msvcfinancial.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.springwebflux.msvcfinancial.mapper.FinancialMapper;
import com.bootcamp.springwebflux.msvcfinancial.models.documents.Movement;
import com.bootcamp.springwebflux.msvcfinancial.repository.MovementRepository;
import com.bootcamp.springwebflux.msvcfinancial.webclient.MsvcAccountWebClient;
import com.bootcamp.springwebflux.msvcfinancial.webclient.MsvcProductWebClient;
import com.msvc.specification.api.dto.AccountDto;
import com.msvc.specification.api.dto.MovementDto;

import reactor.core.publisher.Mono;

@Service
public class FinancialAccountServiceImpl implements FinancialAccountService {

    Logger logger = LoggerFactory.getLogger(FinancialAccountServiceImpl.class);

    @Autowired
    private FinancialMapper financialMapper;

    @Autowired
    private MovementRepository movementRepository;
    
    // @Autowired
    // private MsvcAccountWebClient msvcAccountClient;

    // @Override
    // public Mono<AccountDto> save(String id, Movement movement) {
    //     logger.info("save(Movements getAccountId): " + id);
    //     movement.setId(id);
    //     return movementRepository.save(movement)
    //         .then(msvcAccountClient.getAccount(id))
    //         .flatMap(account -> {
    //             AccountDto accountDto = new AccountDto();
    //             accountDto.setBalance(account.get);
    //             return null;
    //         });
    // }
}
