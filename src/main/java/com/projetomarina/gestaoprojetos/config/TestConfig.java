package com.projetomarina.gestaoprojetos.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetomarina.gestaoprojetos.entities.Client;
import com.projetomarina.gestaoprojetos.entities.Project;
import com.projetomarina.gestaoprojetos.repositories.ClientRepository;
import com.projetomarina.gestaoprojetos.repositories.ProjectRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client(null, "Ana Barros", "ana@gmail.com", "999998888", "12345");
		Client c2 = new Client(null, "Caio Dantas", "caio@gmail.com", "999997777", "01234");
		
		Project p1 = new Project(null, Instant.parse("2019-06-20T19:53:07Z"), c1);
		Project p2 = new Project(null, Instant.parse("2019-07-21T03:42:10Z"), c2);
		Project p3 = new Project(null, Instant.parse("2019-07-22T15:21:22Z"), c1);
		
		clientRepository.saveAll(Arrays.asList(c1, c2));
		projectRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
	
	
}
