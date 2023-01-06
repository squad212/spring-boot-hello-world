package com.example.springbootProject.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j

public class PersonService {
    public String personDetails(String name) {
        return "Hello" + name + ". Welcome to the Java World from service layer";

    }
}
