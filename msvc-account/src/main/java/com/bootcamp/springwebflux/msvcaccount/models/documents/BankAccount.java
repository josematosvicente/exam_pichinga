package com.bootcamp.springwebflux.msvcaccount.models.documents;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("bankAccount")
public class BankAccount {

    @Id
    private String id;
    private String description;
    private String typeAccount;
    private Double commission;

    protected BankAccount(){}

    public BankAccount(String description, String typeAccount, Double commission) {
        this.description = description;
        this.typeAccount = typeAccount;
        this.commission = commission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    private Date createAt;


}
