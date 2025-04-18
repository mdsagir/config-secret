package com.greeting.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "secret")
public class SecretProperties {
    /**
     * Represents a configurable secret property. This variable is expected to hold
     */
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

