package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    public Restaurant addRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return repository.findAll();
    }
}
