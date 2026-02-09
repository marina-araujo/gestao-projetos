package com.projetomarina.gestaoprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomarina.gestaoprojetos.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
