package com.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.backend.model.User;
import com.springboot.backend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {

		this.repository.save(new User("Otávio", "Cavalcanti", "otaviooasc@gmail.com"));
		this.repository.save(new User("Dona", "Maria", "donaMaria@gmail.com"));
		this.repository.save(new User("Seu", "José", "seuJosé@gmail.com"));
		this.repository.save(new User("Agua", "Molhada", "aguaMolhada@gmail.com"));
		this.repository.save(new User("Pinas", "perdes", "pinasEperdes@gmail.com"));

	}

}
