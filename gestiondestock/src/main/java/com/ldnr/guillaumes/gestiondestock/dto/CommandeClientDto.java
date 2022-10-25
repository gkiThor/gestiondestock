package com.ldnr.guillaumes.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.ldnr.guillaumes.gestiondestock.model.CommandeClient;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {
	
	private Integer id;
	
	private String code;
	
	private Instant dateCommande;
	
	private ClientDto client;
	
	private List<LigneCommandeClientDto> ligneCommandeClient;
	

	//-------------------------------------------------------------------------------------------------------------------
	public CommandeClientDto fromEntity(CommandeClient commandeClient) {
		
		if(commandeClient == null) {
			
			return null;
		}
		
		return CommandeClientDto.builder()
				.id(commandeClient.getId())
				.code(commandeClient.getCode())
				.dateCommande(commandeClient.getDateCommande())
				.client(ClientDto.fromEntity(commandeClient.getClient()))
				.build();
	}
	
	//-------------------------------------------------------------------------------------------------------------------
	public CommandeClient toEntity(CommandeClientDto commandeClientDto) {
		
		if(commandeClientDto == null) {
			return null;
		}
		
		CommandeClient commandeClient = new CommandeClient();
		commandeClient.setId(commandeClientDto.getId());
		commandeClient.setCode(commandeClientDto.getCode());
		commandeClient.setDateCommande(commandeClientDto.getDateCommande());
		commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));
		
		return commandeClient;
	}
	
}
