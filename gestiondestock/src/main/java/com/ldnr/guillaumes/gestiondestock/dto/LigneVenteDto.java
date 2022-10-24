package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {
	
	private VentesDto vente;
	
	
	//private ArticleDto article;
	
	
	private BigDecimal quantite;
	
	
	private BigDecimal prixUnitaire;
}
