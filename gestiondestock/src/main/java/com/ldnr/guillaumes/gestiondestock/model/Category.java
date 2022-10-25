package com.ldnr.guillaumes.gestiondestock.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "category")

public class Category extends AbstractEntity{
	
	@Column(name ="code")
	
	private String code;
	
	@Column(name = "designation")
	
	private String designation;
	
	//Mapping
	@OneToMany(mappedBy = "category")
	private List<Article> articles;

}
