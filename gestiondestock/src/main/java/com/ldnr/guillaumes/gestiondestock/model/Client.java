package com.ldnr.guillaumes.gestiondestock.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "client")
public class Client extends AbstractEntity {

	@Column(name ="nom")
	private String nom;
	
	@Column(name ="prenom")
	private String prenom;
	
	@Embedded // champ composé qu"on pourra utilisé dans d'autres entités
	private Adresse adresse;
	
	@Column(name ="phot")
	private String photo;
	
	@Column(name ="mail")
	private String mail;
	
	@Column(name ="numtel")
	private String numTel;
	
	// 1 client à 1 ensemble de commandeClient
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;
}
