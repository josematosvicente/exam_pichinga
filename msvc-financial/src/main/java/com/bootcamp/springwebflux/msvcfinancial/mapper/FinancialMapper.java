package com.bootcamp.springwebflux.msvcfinancial.mapper;

import org.mapstruct.Mapper;

import com.msvc.specification.api.dto.NewAccountProductDto;
import com.msvc.specification.api.dto.NewProductDto;

@Mapper(componentModel = "spring")
public interface FinancialMapper {

    NewProductDto toNewProductDto(NewAccountProductDto value);
    
}
