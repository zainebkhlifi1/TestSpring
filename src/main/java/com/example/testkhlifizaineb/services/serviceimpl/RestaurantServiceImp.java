package com.example.testkhlifizaineb.services.serviceimpl;

import com.example.testkhlifizaineb.models.Restaurant;
import com.example.testkhlifizaineb.repository.RestaurantRepository;
import com.example.testkhlifizaineb.services.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImp implements RestaurantService {
    RestaurantRepository restaurantRepository;
    @Override
    public Restaurant ajouterRestaurantEtMenusAssocie(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
