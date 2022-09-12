package com.bootcamp.springwebflux.msvcadministration.models.documents;

import com.msvc.specification.api.dto.AccountProductDto;
import com.msvc.specification.api.dto.ClientDto;
import com.msvc.specification.api.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "account")
public class Account {

    @Id
    private String id;

    public Account(List<ClientDto> clientList, AccountProductDto accountProductList) {
        this.clientList = clientList;
        this.accountProductList = accountProductList;
    }

    public Account(){}

    private List<ClientDto> clientList;
    private AccountProductDto accountProductList;

}
