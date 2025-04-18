package com.greeting.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "greeting")
public class MessageProperties {

    /**
     * Represents a configurable message property. This variable is expected to hold
     * a string value typically set via external configuration using the prefix "greeting".
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
