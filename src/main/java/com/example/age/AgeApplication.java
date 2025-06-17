package com.example.age;

// Importing essential Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class that serves as the entry point for the Spring Boot application.
 * The @SpringBootApplication annotation bootstraps the entire app, 
 * enabling component scanning, auto-configuration, and Spring Boot features.
 */
@SpringBootApplication
public class AgeApplication {

    /**
     * The main() method starts the Spring Boot application.
     * SpringApplication.run() launches the embedded server (like Tomcat)
     * and begins scanning for components (like @Controller, @Service, etc.).
     */
    public static void main(String[] args) {
        SpringApplication.run(AgeApplication.class, args);
    }
}
