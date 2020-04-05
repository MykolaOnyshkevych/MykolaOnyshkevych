package ua.lviv.iot.sudent.rest;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.rest.dataaccess","ua.lviv.iot.rest.business","ua.lviv.iot.rest.controller"})
@EnableJpaRepositories({"ua.lviv.iot.rest.dataaccess"})
public abstract class RestApplication {
    public static void main(final String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
