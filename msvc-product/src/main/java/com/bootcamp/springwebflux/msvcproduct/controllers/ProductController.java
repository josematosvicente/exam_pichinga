package com.bootcamp.springwebflux.msvcproduct.controllers;

import com.bootcamp.springwebflux.msvcproduct.mapper.ProductMapper;
import com.bootcamp.springwebflux.msvcproduct.services.ProductService;
import com.msvc.specification.api.ProductsApi;
import com.msvc.specification.api.dto.NewProductDto;
import com.msvc.specification.api.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
public class ProductController implements ProductsApi {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Mono<ResponseEntity<ProductDto>> addProduct(Mono<NewProductDto> newProduct, ServerWebExchange exchange) {
        return newProduct.flatMap(newClientDTO -> productService.save(productMapper.toModel(newClientDTO)))
                .map(client ->
                        ResponseEntity.created(URI.create("/api/products/".concat(client.getId())))
                                .contentType(MediaType.APPLICATION_JSON)
                                .body(productMapper.toDto(client)));

    }

    @Override
    public Mono<ResponseEntity<Void>> deleteProduct(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<ProductDto>> findProductById(String id, ServerWebExchange exchange) {
        return productService.findById(id).map(client -> ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(productMapper.toDto(client))
        ).defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Flux<ProductDto>>> findProducts(ServerWebExchange exchange) {

        return Mono.just(ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(productService.findAll().map(productMapper::toDto)));
    }

    @Override
    public Mono<ResponseEntity<Void>> updateProduct(String id, Mono<ProductDto> productDto, ServerWebExchange exchange) {
        return null;
    }

}
