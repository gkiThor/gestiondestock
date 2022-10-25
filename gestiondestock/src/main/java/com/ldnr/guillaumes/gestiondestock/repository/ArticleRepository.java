package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldnr.guillaumes.gestiondestock.model.Article;

public interface ArticleRepository  extends JpaRepository<Integer, Article>{
	
	Optional<Article> findArticleByCodeArticle(String codeArticle);

	List<Article> findAllByCategoryId(Integer idCategory);
}
