package com.bootcamp.springwebflux.msvcclient.mapper;

import com.bootcamp.springwebflux.msvcclient.models.ClientDTO;
import com.bootcamp.springwebflux.msvcclient.models.NewClientDTO;
import com.bootcamp.springwebflux.msvcclient.models.documents.Client;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public ClientDTO toDto (Client client){

        String id = client.getId();
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        String type = client.getType();
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(id);
        clientDTO.setFirstName(firstName);
        clientDTO.setLastName(lastName);
        clientDTO.setType(type);

        return clientDTO;
    }

    public Client toClient (NewClientDTO clientDTO){
        return new Client(clientDTO.getFirstName(),clientDTO.getLastName(),clientDTO.getType());
    }

}
