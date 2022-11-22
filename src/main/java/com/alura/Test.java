package com.alura;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
public class Test {
    @GetMapping("/")
    String home() {
        return "Hello, World!!!!!!!!!!!!!!!!!";
    }

}
