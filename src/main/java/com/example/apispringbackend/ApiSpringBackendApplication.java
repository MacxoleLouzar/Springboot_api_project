package com.example.apispringbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiSpringBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiSpringBackendApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}

