package com.example.apispringbackend;


import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClient() {
        return clientService.getAllClients();
    }

    @PostMapping
    public void createClient(@RequestBody Client client) {
         clientService.addClient(client);
    }

    @GetMapping("{id}")
    public Client getClientById(@PathVariable Integer id) {
        return clientService.getClientById(id);
    }

    @PutMapping("{id}")
    public void updateClient(@PathVariable Integer id, @RequestBody Client client) {
        clientService.updateClient(client, id);
    }
}