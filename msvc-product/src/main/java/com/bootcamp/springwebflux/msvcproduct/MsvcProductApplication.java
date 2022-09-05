package com.bootcamp.springwebflux.msvcproduct;

import com.bootcamp.springwebflux.msvcproduct.models.documents.Product;
import com.bootcamp.springwebflux.msvcproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.util.Date;

@SpringBootApplication
public class MsvcProductApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		Flux.just(new Product("1","Juan","Personal","Pasivo"
						,0.0,10000.0,5000.0,4000.0,new Date()))
				.flatMap(product -> {
					return productRepository.save(product);
				})
				.subscribe();
	}

	@Autowired
	private ReactiveMongoTemplate mongoTemplate;


	public static void main(String[] args) {
		SpringApplication.run(MsvcProductApplication.class, args);
	}

}
