package com.bootcamp.springwebflux.msvcaccount.mapper;
 
import org.mapstruct.Mapper;

import com.bootcamp.springwebflux.msvcaccount.dto.BankAccountDto;
import com.bootcamp.springwebflux.msvcaccount.models.documents.BankAccount;
 
@Mapper(componentModel = "spring")
public interface AccountMapper {

    BankAccountDto mapToDto(BankAccount value);

}