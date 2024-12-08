package org.marouanedbibih.grpc.config;

import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;

import org.marouanedbibih.grpc.models.Compte;
import org.marouanedbibih.grpc.models.TypeCompte;
import org.marouanedbibih.grpc.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInitializer {

    Logger logger = Logger.getLogger(getClass().getName());

    @Bean
    public CommandLineRunner initDatabase(CompteRepository compteRepository) {
        return args -> {
            compteRepository.saveAll(Arrays.asList(
                Compte.builder()
                    .solde(1000)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build(),
                Compte.builder()
                    .solde(2000)
                    .dateCreation(new Date())
                    .type(TypeCompte.EPARGNE)
                    .build(),
                Compte.builder()
                    .solde(3000)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build(),
                Compte.builder()
                    .solde(400)
                    .dateCreation(new Date())
                    .type(TypeCompte.EPARGNE)
                    .build(),
                Compte.builder()
                    .solde(5000)
                    .dateCreation(new Date())
                    .type(TypeCompte.COURANT)
                    .build()
            ));

            logger.info("5 comptes have been inserted into the database.");
        };
    }
}