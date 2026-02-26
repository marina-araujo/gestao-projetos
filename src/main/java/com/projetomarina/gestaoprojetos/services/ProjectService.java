package com.projetomarina.gestaoprojetos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetomarina.gestaoprojetos.entities.Project;
import com.projetomarina.gestaoprojetos.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository repository;
	
	public List<Project> findAll() {
		return repository.findAll();
	}
	
	public Project findById(Long id) {
		Optional<Project> obj = repository.findById(id);
		return obj.get();
	}
}
