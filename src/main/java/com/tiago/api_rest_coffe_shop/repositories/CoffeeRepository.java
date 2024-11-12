package com.tiago.api_rest_coffe_shop.repositories;

import com.tiago.api_rest_coffe_shop.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {}
