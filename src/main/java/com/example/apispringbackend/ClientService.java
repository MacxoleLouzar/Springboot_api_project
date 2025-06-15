package com.example.apispringbackend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public  List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Integer id) {
        return clientRepository.findById(id).orElseThrow(() -> new  IllegalStateException(
                id + "Not Found"));
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }


}
