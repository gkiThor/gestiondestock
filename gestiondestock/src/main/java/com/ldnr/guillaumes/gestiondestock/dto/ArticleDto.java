package com.ldnr.guillaumes.gestiondestock.dto;

import java.math.BigDecimal;

import com.ldnr.guillaumes.gestiondestock.dto.ArticleDto;
import com.ldnr.guillaumes.gestiondestock.dto.CategoryDto;
import com.ldnr.guillaumes.gestiondestock.model.Article;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {
	
	private Integer id;
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTtc;
	
	private String photo;
	
	private CategoryDto category;
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	public static ArticleDto fromEntity(Article article) {
	    if (article == null) {
	      return null;
	    }
	    return ArticleDto.builder()
	        .id(article.getId())
	        .codeArticle(article.getCodeArticle())
	        .designation(article.getDesignation())
	        .photo(article.getPhoto())
	        .prixUnitaireHt(article.getPrixUnitaireHt())
	        .prixUnitaireTtc(article.getPrixUnitaireTtc())
	        .tauxTva(article.getTauxTva())
	        .category(CategoryDto.fromEntity(article.getCategory()))
	        .build();
	  }
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	  public static Article toEntity(ArticleDto articleDto) {
	    if (articleDto == null) {
	      return null;
	    }
	    Article article = new Article();
	    article.setId(articleDto.getId());
	    article.setCodeArticle(articleDto.getCodeArticle());
	    article.setDesignation(articleDto.getDesignation());
	    article.setPhoto(articleDto.getPhoto());
	    article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
	    article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
	    article.setTauxTva(articleDto.getTauxTva());
	    article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
	    return article;
	  }

}
