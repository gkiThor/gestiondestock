package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldnr.guillaumes.gestiondestock.model.LigneCommandeClient;

public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeClient> {

	List<LigneCommandeClient> findAllByCommandeClientId(Integer id);

	List<LigneCommandeClient> findAllByArticleId(Integer id);
}
