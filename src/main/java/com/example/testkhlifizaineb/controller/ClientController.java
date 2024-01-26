package com.example.testkhlifizaineb.controller;


import com.example.testkhlifizaineb.models.Client;
import com.example.testkhlifizaineb.services.ClientService;
import com.example.testkhlifizaineb.services.serviceimpl.ClientServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
ClientServiceImp clientServiceImp;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> ajouterClient(@RequestBody Client client){
        Client addedClient = clientServiceImp.ajouterClient(client);
        return new ResponseEntity<>(addedClient, HttpStatus.CREATED);
    }

}
