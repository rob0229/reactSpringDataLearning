package com.rob0229.reactSpringDataLearning.src.main.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rob0229.reactSpringDataLearning.src.main.java.model.Player;
import com.rob0229.reactSpringDataLearning.src.main.java.repository.PlayerRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final PlayerRepository repository;

	@Autowired
	public DatabaseLoader(PlayerRepository repository) {
		this.repository = repository;
	}

	public void run(String... strings) throws Exception {
		this.repository.save(new Player("rob0229", "rob0229@gmail.com"));
		this.repository.save(new Player("another", "another@gmail.com"));
		this.repository.save(new Player("next", "next@gmail.com"));
	}
}
