package com.result.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.result.entities.User;

// @FeignClient(url = "http://localhost:8082", value = "Question-Client")

// Now Using Load Balancer with Eureka Server and Microservices Architecture
@FeignClient(name = "USER-SERVICE")
public interface UserClient {

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id);

}
