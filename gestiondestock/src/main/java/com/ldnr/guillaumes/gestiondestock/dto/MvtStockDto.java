package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.ldnr.guillaumes.gestiondestock.model.MvtStock;
import com.ldnr.guillaumes.gestiondestock.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvtStockDto {
	
	private Integer id;
	
	private Instant dateMvt;
	
	
	private BigDecimal quantite;
	
	
	
	private ArticleDto article;
	

	private TypeMvtStk typeMvt;
	
	public static MvtStockDto fromEntity(MvtStock mvtStk) {
	    if (mvtStk == null) {
	      return null;
	    }

	    return MvtStockDto.builder()
	        .id(mvtStk.getId())
	        .dateMvt(mvtStk.getDateMvt())
	        .quantite(mvtStk.getQuantite())
	        .article(ArticleDto.fromEntity(mvtStk.getArticle()))
	        .typeMvt(mvtStk.getTypeMvt())
	        .build();
	  }

	  public static MvtStock toEntity(MvtStockDto mvStkDto) {
	    if (mvStkDto == null) {
	      return null;
	    }

	    MvtStock mvtStk = new MvtStock();
	    mvtStk.setId(mvStkDto.getId());
	    mvtStk.setDateMvt(mvStkDto.getDateMvt());
	    mvtStk.setQuantite(mvStkDto.getQuantite());
	    mvtStk.setArticle(ArticleDto.toEntity(mvStkDto.getArticle()));
	    mvtStk.setTypeMvt(mvStkDto.getTypeMvt());

	    return mvtStk;
	  }
	
}
