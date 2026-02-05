package com.projetomarina.gestaoprojetos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomarina.gestaoprojetos.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<Client> findAll() {
		Client c = new Client(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		return ResponseEntity.ok().body(c);
	}
}
