package com.github.ioridazo.server.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("server")
    public String server(){
        return "server";
    }
}
