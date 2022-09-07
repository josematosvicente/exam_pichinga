package com.bootcamp.springwebflux.msvcadministration;

import com.bootcamp.springwebflux.msvcadministration.models.documents.Account;
import com.bootcamp.springwebflux.msvcadministration.repository.AccountRepository;
import com.bootcamp.springwebflux.msvcadministration.services.AdministrationAccountService;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcProductWebClient;
import com.msvc.specification.api.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MsvcAdministrationApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(MsvcAdministrationApplication.class);

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private MsvcProductWebClient msvcProductClient;

    @Autowired
    private AdministrationAccountService administrationAccountService;

    @Override
    public void run(String... args) throws Exception {

        NewAdministrativeAccountDto newAdministrativeAccountDto = new NewAdministrativeAccountDto();
        List<NewClientDto> clientList = new ArrayList<>();
        List<NewAccountProductDto> accountProductList = new ArrayList<>();
        NewClientDto newClientDto = new NewClientDto();
        newClientDto.setFirstName("Felipe");
        newClientDto.setLastName("Garcia");
        newClientDto.setType("Titular");

        clientList.add(newClientDto);

        NewAccountProductDto newAccountProductDto = new NewAccountProductDto();
        newAccountProductDto.setName("Cuenta Bancaria de Ahorro");
        newAccountProductDto.setType("Personal");
        newAccountProductDto.setCategory("Pasivo");
        newAccountProductDto.setCommission(BigDecimal.valueOf(100.0));
        newAccountProductDto.setLimitDeposit(BigDecimal.valueOf(5000.0));
        newAccountProductDto.setLimitWithdrawal(BigDecimal.valueOf(1000.0));

        accountProductList.add(newAccountProductDto);

        newAdministrativeAccountDto.setClientList(clientList);
        newAdministrativeAccountDto.setAccountProductList(accountProductList);
        Flux<AdministrativeAccountDto> accountFlux= administrationAccountService.postAccount(newAdministrativeAccountDto);
        accountFlux.subscribe();

        //Flux.just(new Account("1","Juan","Perez"))
        //		.flatMap(account -> {
        //			return accountRepository.save(account);
        //		})
        //		.subscribe();

        //Mono<ProductDto> product = msvcProductClient.getProduct("1");
        //product.subscribe(productDto -> {
        //    logger.info("Get: " + productDto.getName());
        //});

        //NewProductDto newProductDto = new NewProductDto();
        //newProductDto.setName("Cuenta Bancaria de Ahorro");
        //newProductDto.setType("Personal");
        //newProductDto.setCategory("Pasivo");
        //newProductDto.setCommission(BigDecimal.valueOf(100.0));
        //newProductDto.setLimitDeposit(BigDecimal.valueOf(5000.0));
        //newProductDto.setLimitWithdrawal(BigDecimal.valueOf(1000.0));
        //newProductDto.setLine(null);

        //Mono<ProductDto> product2 = msvcProductClient.postProduct(newProductDto);
        //product2.subscribe(productDto -> {
        //logger.info("Get: " + productDto.getName());
        //});
        //Flux.just(new Account("1","Juan","Perez"))
        //		.flatMap(account -> {
        //			return accountRepository.save(account);
        //		})
        //		.subscribe();
    }

    @Autowired
    private ReactiveMongoTemplate mongoTemplate;


    public static void main(String[] args) {
        SpringApplication.run(MsvcAdministrationApplication.class, args);
    }

}
