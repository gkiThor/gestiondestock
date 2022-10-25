package com.ldnr.guillaumes.gestiondestock.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class Adresse implements Serializable{
	

	@Column(name ="adresse1")
	private String adresse1;
	
	@Column(name ="adresse2")
	private String adresse2;
	
	@Column(name = "ville")
	private String ville;
	
	@Column(name = "codepostale")
	private String codePostale;
	
	@Column(name = "pays")
	private String pays;

}
