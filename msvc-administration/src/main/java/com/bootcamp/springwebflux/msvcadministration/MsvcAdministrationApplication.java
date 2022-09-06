package com.bootcamp.springwebflux.msvcadministration;

import com.bootcamp.springwebflux.msvcadministration.models.documents.Account;
import com.bootcamp.springwebflux.msvcadministration.repository.AccountRepository;
import com.bootcamp.springwebflux.msvcadministration.services.AdministrationAccountService;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcProductClient;
import com.msvc.specification.api.dto.ProductDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@SpringBootApplication
public class MsvcAdministrationApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(MsvcAdministrationApplication.class);

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private MsvcProductClient msvcProductClient;

    @Override
    public void run(String... args) throws Exception {


        Mono<ProductDto> product = msvcProductClient.getProduct("1");
        product.subscribe(productDto -> {
            logger.info("Get: " + productDto.getName());
        });
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
