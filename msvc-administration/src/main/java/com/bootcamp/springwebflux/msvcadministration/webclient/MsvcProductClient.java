package com.bootcamp.springwebflux.msvcadministration.webclient;

import com.bootcamp.springwebflux.msvcadministration.services.AdministrationAccountService;
import com.msvc.specification.api.dto.ProductDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MsvcProductClient {

    Logger logger = LoggerFactory.getLogger(AdministrationAccountService.class);

    WebClient webclient = WebClient.create("http://localhost:8080");

    public Mono<ProductDto> getProduct(String id) {
        logger.info(String.format("Calling getProduct (%s)", id));

        return webclient.get()
                .uri("/products/{id}", id)
                .retrieve()
                .bodyToMono(ProductDto.class);
    }
}
