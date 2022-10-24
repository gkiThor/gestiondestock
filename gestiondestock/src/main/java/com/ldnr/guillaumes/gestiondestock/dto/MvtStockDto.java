package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.ldnr.guillaumes.gestiondestock.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStockDto {
	
	private Instant dateMvt;
	
	
	private BigDecimal quantite;
	
	
	
	private ArticleDto article;
	

	private TypeMvtStk typeMvt;
}
