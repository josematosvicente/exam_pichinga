package com.bootcamp.springwebflux.msvcadministration.services;

import com.msvc.specification.api.dto.AdministrativeAccountDto;
import com.msvc.specification.api.dto.ProductDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AdministrationAccountServiceImpl implements AdministrationAccountService{
    @Override
    public Flux<AdministrativeAccountDto> getAccount() {
        return null;
    }
}
