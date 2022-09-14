package com.bootcamp.springwebflux.msvcfinancial.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FinancialAccountServiceImpl implements FinancialAccountService {

    Logger logger = LoggerFactory.getLogger(FinancialAccountServiceImpl.class);

    // @Autowired
    // private FinancialMapper financialMapper;

    // @Autowired
    // private MovementRepository movementRepository;
    
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
