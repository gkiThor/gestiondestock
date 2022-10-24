package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {
	
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTtc;
	
	private String photo;
	
	private CategoryDto category;

}
