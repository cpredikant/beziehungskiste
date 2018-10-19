package de.cpredikant.beziehungskiste.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("de.cpredikant.beziehungskiste.**.*")
@ComponentScan("de.cpredikant.beziehungskiste")
@EnableJpaRepositories(basePackages="de.cpredikant.beziehungskiste")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
