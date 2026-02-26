package com.projetomarina.gestaoprojetos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomarina.gestaoprojetos.entities.Project;
import com.projetomarina.gestaoprojetos.services.ProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectResource {

	@Autowired
	private ProjectService service;
	
	@GetMapping
	public ResponseEntity<List<Project>> findAll() {
		List<Project> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Project> findById(@PathVariable Long id) {
		Project obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
