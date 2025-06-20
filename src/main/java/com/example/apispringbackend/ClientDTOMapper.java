package com.example.apispringbackend;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ClientDTOMapper implements Function<Client, ClientDTO> {
    @Override
    public ClientDTO apply(Client client) {
        return new ClientDTO(
                client.getId(),
                client.getName(),
                client.getEmail(),
                client.getAge(),
                client.getGender(),
                client.getPhone() == null ? new ArrayList<>():
                client.getPhone()
                        .stream()
                        .map( PhoneDTO::new)
                        .collect(Collectors.toList()),
                client.getAddress()
        );
    }
}
