package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldnr.guillaumes.gestiondestock.model.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurRepository extends JpaRepository<Integer, LigneCommandeFournisseur>{

	List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(Integer idCommande);

	List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommande);
}
