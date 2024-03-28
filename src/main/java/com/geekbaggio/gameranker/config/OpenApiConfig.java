package com.geekbaggio.gameranker.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Daniel Sabana",
                        email = "contact@andeandigital.net"
                ),
                description = "OpenAPI documentation for Game Ranker API",
                title = "Game Ranker API",
                version = "v1.0.0"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "Development",
                        url = "https://gameranker-DEV.andeandigital.net"
                ),
                @Server(
                        description = "Production",
                        url = "https://gameranker.andeandigital.net"
                ),
        },
        tags = {
                @Tag(
                        name = "Games"
                )
        }
)
public class OpenApiConfig {
}
