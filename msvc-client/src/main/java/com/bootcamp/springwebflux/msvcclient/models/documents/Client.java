package com.bootcamp.springwebflux.msvcclient.models.documents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "client")
public class Client {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String type;
    public Client() {}

    public Client(String firstName, String lastName, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }

}
