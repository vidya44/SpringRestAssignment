package com.example.SpringRestAssignment;

import com.example.SpringRestAssignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    public static void main(String[] args) {

        SpringApplication.run(SpringRestApplication.class, args);
        System.out.println("Successfully running");
    }

    @Override
    public void run(String... args) throws Exception {



    }
}

