package com.m.g.oauth2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

@SpringBootApplication
public class Oauth2clientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2clientApplication.class, args);
    }

}
