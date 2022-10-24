package com.ldnr.guillaumes.gestiondestock.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
	
	private String code;
	
	
	private String designation;
	
	
	private List<ArticleDto> articles;
}
