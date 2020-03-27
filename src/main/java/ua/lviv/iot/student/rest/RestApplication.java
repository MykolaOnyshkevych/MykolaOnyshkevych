package ua.lviv.iot.student.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories({"ua.lviv.iot.student.dataaccess"})
@ComponentScan({"ua.lviv.iot.student.rest.controller","ua.lviv.iot.student.dataaccess", "ua.lviv.iot.student.business"})
@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
