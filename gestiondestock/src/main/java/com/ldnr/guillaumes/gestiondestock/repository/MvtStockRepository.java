package com.ldnr.guillaumes.gestiondestock.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ldnr.guillaumes.gestiondestock.model.MvtStock;

public interface MvtStockRepository extends JpaRepository<Integer, MvtStock>{

	@Query("select sum(m.quantite) from MvtStk m where m.article.id = :idArticle")
	BigDecimal stockReelArticle(@Param("idArticle") Integer idArticle);

	List<MvtStock> findAllByArticleId(Integer idArticle);
}
