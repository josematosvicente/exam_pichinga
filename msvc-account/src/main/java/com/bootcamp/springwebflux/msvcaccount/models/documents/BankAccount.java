package com.bootcamp.springwebflux.msvcaccount.models.documents;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Document("bankAccount")
@Getter
@Setter
public class BankAccount {

    @Id
    private String id;
    private String description;
    private String typeAccount;
    private Double commission;
    private Date createAt;
}
