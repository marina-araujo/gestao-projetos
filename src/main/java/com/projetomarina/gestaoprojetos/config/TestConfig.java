package com.projetomarina.gestaoprojetos.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetomarina.gestaoprojetos.entities.Client;
import com.projetomarina.gestaoprojetos.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client(null, "Ana Barros", "ana@gmail.com", "999998888", "12345");
		Client c2 = new Client(null, "Caio Dantas", "caio@gmail.com", "999997777", "01234");
		clientRepository.saveAll(Arrays.asList(c1, c2));
	}
	
	
}
