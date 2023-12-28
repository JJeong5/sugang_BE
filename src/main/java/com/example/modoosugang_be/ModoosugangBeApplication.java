package com.example.modoosugang_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ModoosugangBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModoosugangBeApplication.class, args);
    }

}
