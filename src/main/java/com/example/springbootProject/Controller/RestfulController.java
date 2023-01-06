package com.example.springbootProject.Controller;

import com.example.springbootProject.Model.GreetingResponse;
import com.example.springbootProject.Services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RestfulController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "/greeting", produces = "application/json")
    public GreetingResponse getGreeting(@RequestParam String name){
        String firstName = personService.personDetails(name);
        return GreetingResponse.builder().greeting(firstName).build();
    }
}
