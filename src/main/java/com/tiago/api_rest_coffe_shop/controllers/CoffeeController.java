package com.tiago.api_rest_coffe_shop.controllers;

import com.tiago.api_rest_coffe_shop.models.Coffee;
import com.tiago.api_rest_coffe_shop.repositories.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Coffee> getAllCoffee() {
        return  coffeeRepository.findAll();

    }
    @PostMapping(value = "/createCoffee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Coffee createNewCoffee(@RequestBody Coffee coffee) {
        Coffee createCoffee = new Coffee();

        createCoffee.setName(coffee.getName());
        createCoffee.setPrice(coffee.getPrice());

        return coffeeRepository.save(createCoffee);
    }
}
