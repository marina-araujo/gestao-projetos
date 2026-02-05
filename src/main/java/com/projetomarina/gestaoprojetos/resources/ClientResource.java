package com.projetomarina.gestaoprojetos.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomarina.gestaoprojetos.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		Client c1 = new Client(1L, "Maria", "maria@gmail.com", "9999999", "123456");
		Client c2 = new Client(2L, "Ana", "ana@gmail.com", "9999999", "123456");
		List<Client> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		return ResponseEntity.ok().body(list);
	}
}
