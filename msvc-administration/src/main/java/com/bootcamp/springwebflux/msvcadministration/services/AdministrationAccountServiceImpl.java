package com.bootcamp.springwebflux.msvcadministration.services;

import com.bootcamp.springwebflux.msvcadministration.mapper.AdministrationMapper;
import com.bootcamp.springwebflux.msvcadministration.models.documents.Account;
import com.bootcamp.springwebflux.msvcadministration.repository.AccountRepository;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcClientWebClient;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcProductWebClient;
import com.msvc.specification.api.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdministrationAccountServiceImpl implements AdministrationAccountService {

    Logger logger = LoggerFactory.getLogger(AdministrationAccountServiceImpl.class);
    @Autowired
    private MsvcProductWebClient msvcProductClient;
    @Autowired
    private MsvcClientWebClient msvcClientWebClient;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AdministrationMapper administrationMapper;

    @Override
    public Mono<Account> save(Account account) {
        logger.info("save(Account getAccountProductList): " + account.getAccountProductList());
        logger.info("save(Account getClientList): " + account.getClientList());
        return accountRepository.save(account);
    }

    @Override
    public Mono<Account> postAccount(NewAdministrativeAccountDto newAdministrativeAccountDto) {

        return Flux.fromIterable(newAdministrativeAccountDto.getClientList())
                .flatMap(newClientDto -> msvcClientWebClient.postClient(newClientDto)
                )
                .map(clientDto -> {
                    List<ClientDto> clientList = new ArrayList<>();
                    clientList.add(clientDto);
                    logger.info("clientDto.getFirstName " + clientDto.getFirstName());
                    logger.info("clientDto.getId " + clientDto.getId());
                    return clientList;
                }).zipWith(Flux.fromIterable(newAdministrativeAccountDto.getAccountProductList())
                        .flatMap(newAccountProductDto -> msvcProductClient.postProduct(administrationMapper.toNewProductDto(newAccountProductDto))
                                .map(productDto -> {
                                    List<AccountProductDto> accountProductList = new ArrayList<>();
                                    accountProductList.add(administrationMapper.toAccountProductDto(productDto));
                                    logger.info("productDto.getId " + productDto.getId());
                                    logger.info("productDto.getId " + productDto.getName());
                                    return accountProductList;
                                }))
                ).flatMap(objects -> {
                    Account account = new Account(objects.getT1(), objects.getT2());
                    return accountRepository.save(account);
                }).next();

    }
}
