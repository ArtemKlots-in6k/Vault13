package com.in6k.vault13;

import com.in6k.vault13.databaseConnector.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Vault13Application {

    public static void main(String[] args) {
        SpringApplication.run(Vault13Application.class, args);
    }
}
