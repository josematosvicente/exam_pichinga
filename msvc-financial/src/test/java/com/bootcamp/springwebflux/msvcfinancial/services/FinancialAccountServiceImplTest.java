package com.bootcamp.springwebflux.msvcfinancial.services;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bootcamp.springwebflux.msvcfinancial.models.documents.Movement;
import com.bootcamp.springwebflux.msvcfinancial.repository.MovementRepository;
import com.bootcamp.springwebflux.msvcfinancial.webclient.MsvcAdministrativeWebClient;
import com.msvc.specification.api.dto.AccountDto;
import com.msvc.specification.api.dto.MovementDto;

import reactor.core.publisher.Mono;

public class FinancialAccountServiceImplTest {

    @MockBean
    MovementRepository movementRepository;

    @MockBean
    private MsvcAdministrativeWebClient msvcAdministrativeClient;

    @Test
    void testSave() {

        Movement movement = new Movement();
        movement.setAmount(Double.valueOf(100));
        movement.setType("DEPOSIT");
        movement.setId("632767dfb8cc775d5e1f5743");

        // MovementDto movementDto = new MovementDto();
        // movementDto.setAmount(Double.valueOf(100));
        // movementDto.setType("DEPOSIT");

        // AccountDto accountDto = new AccountDto();
        // accountDto.setBalance(Double.valueOf(100));

        // Mockito.when(movementRepository.save(movement))
        //     .thenReturn(Mono.just(movement));

        // Mockito.verify(financialAccountService).save("1234",movement);

    }

    @Test
    void testValidate() {

    }
}
