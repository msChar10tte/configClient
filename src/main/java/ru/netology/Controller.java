package ru.netology;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${test.msg}")
    private String message;

    @GetMapping("/hello")
    public String hello() {
        return message;
    }
}