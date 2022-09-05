package com.bootcamp.springwebflux.msvcproduct.mapper;

import com.bootcamp.springwebflux.msvcproduct.models.DTO.ProductDTO;
import com.bootcamp.springwebflux.msvcproduct.models.documents.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDto(Product value);

    Product toModel(ProductDTO value);


}
