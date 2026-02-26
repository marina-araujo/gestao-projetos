package com.projetomarina.gestaoprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomarina.gestaoprojetos.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
