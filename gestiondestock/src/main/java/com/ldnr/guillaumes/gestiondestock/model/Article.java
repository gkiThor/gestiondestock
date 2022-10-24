package com.ldnr.guillaumes.gestiondestock.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "article")
public class Article extends AbstractEntity{
	
	@Column(name = "coedearticle")
	private String codeArticle;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "prixunitaireht")
	private BigDecimal prixUnitaireHt;
	
	@Column(name = "tauxtva")
	private BigDecimal tauxTva;
	
	@Column(name = "prixunitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "photo")
	private String photo;
	
	//Mapping
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;

}
