package service;

import modele.Client;
import repository.ClientRepository;

import java.util.List;

public class ClientService {
    private ClientRepository clientRepository;
    public List<Client> listsAll() {

        return clientRepository.findAll();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }
}
