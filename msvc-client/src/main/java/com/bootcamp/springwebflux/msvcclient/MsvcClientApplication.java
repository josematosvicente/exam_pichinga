package com.bootcamp.springwebflux.msvcclient;

import com.bootcamp.springwebflux.msvcclient.models.documents.Client;
import com.bootcamp.springwebflux.msvcclient.repository.ClientRepository;
import com.bootcamp.springwebflux.msvcclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class MsvcClientApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		mongoTemplate.dropCollection("client").subscribe();

		Flux.just(new Client("1","Juan","Perez","Titular"))
				.flatMap(client -> {
					return clientRepository.save(client);
				})
				.subscribe()
		;
	}

	@Autowired
	private ReactiveMongoTemplate mongoTemplate;



	public static void main(String[] args) {
		SpringApplication.run(MsvcClientApplication.class, args);
	}

}
