package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;

import com.ldnr.guillaumes.gestiondestock.model.CommandeFournisseur;
import com.ldnr.guillaumes.gestiondestock.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {
	
	private Integer id;
	
	private ArticleDto article;
	
	
	private CommandeFournisseur commandeFournisseur;
	

	private BigDecimal quantite;
	

	private BigDecimal prixUnitaire;
	
	
	public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
	    if (ligneCommandeFournisseur == null) {
	      return null;
	    }
	    return LigneCommandeFournisseurDto.builder()
	        .id(ligneCommandeFournisseur.getId())
	        .article(ArticleDto.fromEntity(ligneCommandeFournisseur.getArticle()))
	        .quantite(ligneCommandeFournisseur.getQuantite())
	        .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
	        .build();
	  }

	  public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto lCFournisseurdto) {
	    if (lCFournisseurdto == null) {
	      return null;
	    }

	    LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
	    ligneCommandeFournisseur.setId(lCFournisseurdto.getId());
	    ligneCommandeFournisseur.setArticle(ArticleDto.toEntity(lCFournisseurdto.getArticle()));
	    ligneCommandeFournisseur.setPrixUnitaire(lCFournisseurdto.getPrixUnitaire());
	    ligneCommandeFournisseur.setQuantite(lCFournisseurdto.getQuantite());
	    
	    return ligneCommandeFournisseur;
	  }
	
}
