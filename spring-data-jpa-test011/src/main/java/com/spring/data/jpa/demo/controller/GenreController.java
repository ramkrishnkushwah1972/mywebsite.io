package com.spring.data.jpa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.data.jpa.demo.model.Actor;
import com.spring.data.jpa.demo.repository.ActorRepository;
import com.spring.data.jpa.demo.repository.GenreRepository;
import com.spring.data.jpa.demo.repository.MovieRepository;

@Controller
public class GenreController {

	@Autowired
	private GenreRepository genreRepository;

	@Autowired
	private ActorRepository actorRepository;

	@Autowired
	private MovieRepository movieRepository;

	public void run() {

		// Insert data
		Actor a1 = new Actor("Akshay", "Kumar", 1972, null);
		Actor a2 = new Actor("Mithun", "Chakravarti", 1960, null);
		Actor a3 = new Actor("Ajay", "Devgan", 1966, null);

		genreRepository.save(a1);

		List<Actor> actors1 = new ArrayList<Actor>();

		actors1.add(a1);
		actors1.add(a2);

		List<Actor> actors2 = new ArrayList<Actor>();

		actors1.add(a3);
	}

}
