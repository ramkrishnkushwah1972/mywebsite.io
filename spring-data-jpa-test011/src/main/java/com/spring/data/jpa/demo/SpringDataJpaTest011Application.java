package com.spring.data.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.spring.data.jpa.demo.controller.GenreController;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SpringDataJpaTest011Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaTest011Application.class, args);
	}

	@Autowired
	GenreController genreController;

	@Override
	public void run(String... args) throws Exception {
		genreController.run();
		
	}

	

}
