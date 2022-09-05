package com.bootcamp.springwebflux.msvcproduct.controllers;

import com.bootcamp.springwebflux.msvcproduct.api.ProductsApi;
import com.bootcamp.springwebflux.msvcproduct.mapper.ProductMapper;
import com.bootcamp.springwebflux.msvcproduct.models.DTO.NewProductDTO;
import com.bootcamp.springwebflux.msvcproduct.models.DTO.ProductDTO;
import com.bootcamp.springwebflux.msvcproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController implements ProductsApi {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Mono<ResponseEntity<ProductDTO>> addProduct(Mono<NewProductDTO> newProduct, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteProduct(Long id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<ProductDTO>> findProductById(Long id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Flux<ProductDTO>>> findProducts(ServerWebExchange exchange) {

        return Mono.just(ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(productService.findAll().map(productMapper::toDto)));
    }

    @Override
    public Mono<ResponseEntity<Void>> updateProduct(String id, Mono<ProductDTO> product, ServerWebExchange exchange) {
        return null;
    }
}
