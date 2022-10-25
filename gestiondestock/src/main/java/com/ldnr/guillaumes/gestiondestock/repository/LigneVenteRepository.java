package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ldnr.guillaumes.gestiondestock.model.LigneVente;

public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente>{
	
	List<LigneVente> findAllByArticleId(Integer idArticle);

	List<LigneVente> findAllByVenteId(Integer id);
}
