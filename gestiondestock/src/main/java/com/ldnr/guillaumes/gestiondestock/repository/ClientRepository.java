package com.ldnr.guillaumes.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldnr.guillaumes.gestiondestock.model.Client;

public interface ClientRepository extends JpaRepository<Integer, Client>{

}
