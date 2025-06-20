package com.example.apispringbackend;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientDTOMapper clientDTOMapper;
    public ClientService(ClientRepository clientRepository, ClientDTOMapper clientDTOMapper) {
        this.clientRepository = clientRepository;
        this.clientDTOMapper = clientDTOMapper;
    }

    public  List<ClientDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(clientDTOMapper)
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Integer id) {
        return clientRepository.findById(id)
                .map(clientDTOMapper)
                .orElseThrow(() -> new  IllegalStateException(
                id + "Not Found"));
    }

    public void addClient(Client client) {
         clientRepository.save(client);
    }

    public void updateClient(Client client, Integer id) {
        Optional<ClientDTO> existingClient = clientRepository.findById(id).map(clientDTOMapper);
        if (existingClient.isPresent()) {
            client.setId(id); // Make sure the update targets the correct ID
             clientRepository.save(client);
        }
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

}
