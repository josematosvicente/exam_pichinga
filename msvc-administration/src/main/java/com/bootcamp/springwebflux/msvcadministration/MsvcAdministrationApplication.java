package com.bootcamp.springwebflux.msvcadministration;

import com.bootcamp.springwebflux.msvcadministration.models.documents.Account;
import com.bootcamp.springwebflux.msvcadministration.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.util.Date;

@SpringBootApplication
public class MsvcAdministrationApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {

		Flux.just(new Account("1","Juan","Perez"))
				.flatMap(account -> {
					return accountRepository.save(account);
				})
				.subscribe();
	}

	@Autowired
	private ReactiveMongoTemplate mongoTemplate;


	public static void main(String[] args) {
		SpringApplication.run(MsvcAdministrationApplication.class, args);
	}

}