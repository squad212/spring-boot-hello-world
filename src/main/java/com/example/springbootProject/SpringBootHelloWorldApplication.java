package com.example.springbootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }
    @GetMapping("/name")
    public String getPersonDetails (@PathVariable String name){


        return "";
    }
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName",
            defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
