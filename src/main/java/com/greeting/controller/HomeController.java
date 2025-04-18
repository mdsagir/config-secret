package com.greeting.controller;

import com.greeting.config.MessageProperties;
import com.greeting.config.SecretProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    private final MessageProperties messageProperties;
    private final SecretProperties secretProperties;

    public HomeController(MessageProperties messageProperties, SecretProperties secretProperties) {
        this.messageProperties = messageProperties;
        this.secretProperties = secretProperties;
    }

    @GetMapping("config")
    public Map<String,String> config() {
        return Map.of("message", messageProperties.getMessage());
    }
    @GetMapping("secret")
    public Map<String,String> secret() {
        return Map.of("password", secretProperties.getPassword());
    }
}
