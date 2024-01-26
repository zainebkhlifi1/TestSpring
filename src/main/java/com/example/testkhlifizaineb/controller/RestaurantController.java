package com.example.testkhlifizaineb.controller;

import com.example.testkhlifizaineb.models.Client;
import com.example.testkhlifizaineb.models.Restaurant;
import com.example.testkhlifizaineb.services.RestaurantService;
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
@RequestMapping("/restaurant")
public class RestaurantController {
        @Autowired
        RestaurantService restaurantService;
        @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Client> ajouterRest(@RequestBody Restaurant restaurant){
            Restaurant addedClient = restaurantService.ajouterRestaurantEtMenusAssocie(restaurant);
            return new ResponseEntity<>(addedClient, HttpStatus.CREATED);
        }  git





}
