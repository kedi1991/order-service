package com.microservicios.orders_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/orders")
public class UserController {

    @GetMapping
    public List<String> getOrders(){
        return List.of("order 1", "order 2", "order 3");
    }
}
