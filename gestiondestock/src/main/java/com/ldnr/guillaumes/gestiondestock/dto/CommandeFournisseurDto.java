package com.ldnr.guillaumes.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.ldnr.guillaumes.gestiondestock.model.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {
	
	private Integer id;
	
	private String code;
	
	
	private Instant dateCommande;
	
	
	private FournisseurDto fournisseur;
	
	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;
	
	//-------------------------------------------------------------------------------------------------------------------
	public CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
		
		if(commandeFournisseur == null) {
			return null;
		}
		
		return CommandeFournisseurDto.builder()
				.id(commandeFournisseur.getId())
				.code(commandeFournisseur.getCode())
				.dateCommande(commandeFournisseur.getDateCommande())
				.fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
				.build();
	}
	
	//-------------------------------------------------------------------------------------------------------------------
	public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {
	    if (commandeFournisseurDto == null) {
	      return null;
	    }
	    CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
	    commandeFournisseur.setId(commandeFournisseurDto.getId());
	    commandeFournisseur.setCode(commandeFournisseurDto.getCode());
	    commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
	    commandeFournisseur.setFournisseur(FournisseurDto.toEntity(commandeFournisseurDto.getFournisseur()));
	    
	    return commandeFournisseur;
	  }
}
