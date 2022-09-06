package com.bootcamp.springwebflux.msvcadministration.services;

import com.msvc.specification.api.dto.AdministrativeAccountDto;
import com.msvc.specification.api.dto.ProductDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AdministrationAccountService {

    public Flux<AdministrativeAccountDto> getAccount();

}
