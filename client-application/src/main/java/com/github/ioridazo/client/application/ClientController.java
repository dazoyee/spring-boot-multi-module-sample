package com.github.ioridazo.client.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @GetMapping("client")
    public String client(){
        final String server = restTemplate().getForObject("http://localhost:8082/server", String.class);
        System.out.println(server);
        return "client";
    }

    private RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
