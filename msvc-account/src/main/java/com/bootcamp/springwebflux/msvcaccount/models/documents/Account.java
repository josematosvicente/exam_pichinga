package com.bootcamp.springwebflux.msvcaccount.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;

@Document(collection = "account")
public class Account {

    @Id
    private String id;
    private String clientType;

    public Account() {}

    public Account(String id, String clientType, ArrayList<BankAccount> bankAccountArrayList, Date createAt) {
        this.id = id;
        this.clientType = clientType;
        this.bankAccountArrayList = bankAccountArrayList;
        this.createAt = createAt;
    }

    private ArrayList<BankAccount> bankAccountArrayList;
    private Date createAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public ArrayList<BankAccount> getBankAccountArrayList() {
        return bankAccountArrayList;
    }

    public void setBankAccountArrayList(ArrayList<BankAccount> bankAccountArrayList) {
        this.bankAccountArrayList = bankAccountArrayList;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }


}
