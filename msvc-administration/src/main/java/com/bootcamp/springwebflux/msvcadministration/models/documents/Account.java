package com.bootcamp.springwebflux.msvcadministration.models.documents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "account")
public class Account {

    @Id
    private String id;

    private String clientId;
    private String productId;


}
