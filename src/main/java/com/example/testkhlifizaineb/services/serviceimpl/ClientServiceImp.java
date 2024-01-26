package com.example.testkhlifizaineb.services.serviceimpl;

import com.example.testkhlifizaineb.models.Client;
import com.example.testkhlifizaineb.repository.ClientRepository;
import com.example.testkhlifizaineb.services.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp implements ClientService {
ClientRepository clientRepository;
    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }
}
