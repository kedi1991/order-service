package com.microservicios.orders_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/orders")
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<String> getOrders(){
        return List.of("order 1", "order 2", "order 3");
    }

    @GetMapping("/user/{id}")
    public String getUserFromUserService(@PathVariable String id) {
        
        String url = "http://user-service:8080/users";
        return restTemplate.getForObject(url, String.class);
    }
    
}
