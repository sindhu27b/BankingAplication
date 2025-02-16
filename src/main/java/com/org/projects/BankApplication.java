package com.org.projects;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Bank Application",
                description = "Backend Rest APIs",
                version = "v1.0",
                contact = @Contact(
                        name = "Sindhuja",
                        email = "sindhujabollikonda@gmail.com",
                        url = "https://github.com/sindhu27b/BankingApplication"
                ),
                license = @License(
                        name = "Sindhuja Spring Project",
                        url = "https://github.com/sindhu27b/BankingApplication"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Banking App Documentation",
                url = "https://github.com/sindhu27b/BankingApplication"
        )
)
public class BankApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(BankApplication.class, args);
    }
}