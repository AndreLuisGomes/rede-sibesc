package com.sibesc.rede_sibesc;

import com.sibesc.rede_sibesc.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
}
