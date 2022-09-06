package com.bootcamp.springwebflux.msvcadministration;

import com.bootcamp.springwebflux.msvcadministration.repository.AccountRepository;
import com.bootcamp.springwebflux.msvcadministration.services.AdministrationAccountService;
import com.bootcamp.springwebflux.msvcadministration.webclient.MsvcProductWebClient;
import com.msvc.specification.api.dto.NewProductDto;
import com.msvc.specification.api.dto.ProductDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

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
