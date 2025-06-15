package com.example.apispringbackend;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Client updateClient(Client client, Integer id) {
        Optional<Client> existingClient = clientRepository.findById(id);
        if (existingClient.isPresent()) {
            client.setId(id); // Make sure the update targets the correct ID
            return clientRepository.save(client);
        } else {
            return null;
        }
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

}
