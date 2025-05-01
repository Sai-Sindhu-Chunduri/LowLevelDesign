package com.example.LowLevelDesign.BookMyShow;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BmsApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(BmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    // HW : Create a show
        // Create a user
        // Make a booking

    }
}
