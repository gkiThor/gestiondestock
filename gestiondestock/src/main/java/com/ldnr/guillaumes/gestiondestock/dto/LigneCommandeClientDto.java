package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;

import com.ldnr.guillaumes.gestiondestock.model.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {
	
	private Integer id;
	
	private ArticleDto article;
	
	
	private CommandeClientDto commandeClient;
	

	private BigDecimal quantite;
	

	private BigDecimal prixUnitaire;
	
	public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {
	    if (ligneCommandeClient == null) {
	      return null;
	    }
	    return LigneCommandeClientDto.builder()
	        .id(ligneCommandeClient.getId())
	        .article(ArticleDto.fromEntity(ligneCommandeClient.getArticle()))
	        .quantite(ligneCommandeClient.getQuantite())
	        .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
	        .build();
	  }

	  public static LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
	    if (ligneCommandeClientDto == null) {
	      return null;
	    }

	    LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
	    ligneCommandeClient.setId(ligneCommandeClientDto.getId());
	    ligneCommandeClient.setArticle(ArticleDto.toEntity(ligneCommandeClientDto.getArticle()));
	    ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());
	    ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
	    
	    return ligneCommandeClient;
	  }
}
