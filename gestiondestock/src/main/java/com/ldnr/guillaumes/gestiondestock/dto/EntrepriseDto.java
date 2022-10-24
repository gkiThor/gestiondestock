package com.ldnr.guillaumes.gestiondestock.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {
	
	private String nom;
	
	private String description;
	
	private AdresseDto adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;

	private String siteWeb;
	
	private List<UtilisateurDto> utilisateur;
}
