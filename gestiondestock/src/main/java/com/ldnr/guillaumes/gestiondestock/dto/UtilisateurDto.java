package com.ldnr.guillaumes.gestiondestock.dto;

import java.time.Instant;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private Instant dateDeNaissance;
	
	private String motDePasse;
	
	private AdresseDto adresse;
	
	private String photo;

	private EntrepriseDto entreprise;
	
	private List<RolesDto> roles;
}
