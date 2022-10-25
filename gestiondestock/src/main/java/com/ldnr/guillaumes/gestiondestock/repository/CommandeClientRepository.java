package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ldnr.guillaumes.gestiondestock.model.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient>{

	Optional<CommandeClient> findCommandeClientByCode(String code);

	List<CommandeClient> findAllByClientId(Integer id);
}
