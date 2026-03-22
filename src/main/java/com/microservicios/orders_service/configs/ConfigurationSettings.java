package com.microservicios.orders_service.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class ConfigurationSettings {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
}