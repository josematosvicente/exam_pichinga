package com.bootcamp.springwebflux.msvcadministration.services;

import org.springframework.web.reactive.function.client.WebClient;

public interface AdministrationAccountService {

    WebClient webclient = WebClient.create("http://localhost:8080");



}
