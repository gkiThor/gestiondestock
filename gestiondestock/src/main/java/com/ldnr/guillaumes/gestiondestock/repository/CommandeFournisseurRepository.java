package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ldnr.guillaumes.gestiondestock.model.CommandeClient;
import com.ldnr.guillaumes.gestiondestock.model.CommandeFournisseur;

public interface CommandeFournisseurRepository extends JpaRepository<Integer, CommandeFournisseur>{

	Optional<CommandeFournisseur> findCommandeFournisseurByCode(String code);

	List<CommandeClient> findAllByFournisseurId(Integer id);
}
