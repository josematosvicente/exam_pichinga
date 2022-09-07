package com.bootcamp.springwebflux.msvcadministration.services;

import com.bootcamp.springwebflux.msvcadministration.mapper.AdministrativeMapper;
import com.bootcamp.springwebflux.msvcadministration.models.documents.Account;
import com.bootcamp.springwebflux.msvcadministration.repository.AccountRepository;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcClientWebClient;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcProductWebClient;
import com.msvc.specification.api.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
    private AdministrativeMapper accountProductMapper;

    @Override
    public Mono<Account> save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Flux<AdministrativeAccountDto> postAccount(NewAdministrativeAccountDto newAdministrativeAccountDto) {

        List<ClientDto> clientList = new ArrayList<>();
        List<NewClientDto> newClientList = newAdministrativeAccountDto.getClientList();
        Flux.fromIterable(newClientList).collectList().subscribe(
                list -> {
                    list.forEach(newClientDto -> {
                        Mono<ClientDto> postClient = msvcClientWebClient.postClient(newClientDto);
                        postClient.subscribe(clientDto -> {
                            logger.info("PostClient: " + clientDto);
                            clientList.add(clientDto);
                        });
                    });
                }
        );

        List<AccountProductDto> accountProductList = new ArrayList<>();
        List<NewAccountProductDto> newAccountProductList = newAdministrativeAccountDto.getAccountProductList();
        Flux.fromIterable(newAccountProductList).collectList().subscribe(
                list -> {
                    list.forEach(newAccountProduct -> {
                        Mono<ProductDto> postProduct = msvcProductClient.postProduct(accountProductMapper.toNewProductDto(newAccountProduct));
                        postProduct.subscribe(productDto -> {
                            logger.info("PostProduct: " + productDto);
                            accountProductList.add(accountProductMapper.toAccountProductDto(productDto));
                        });
                    });
                }
        );

        Account account = new Account(clientList, accountProductList);
        Mono<Account> accountMono = this.save(account);
        return Flux.from(accountMono).map(account1 -> {
            return accountProductMapper.toAdministrativeAccountDto(account1);
        });


    }
}
