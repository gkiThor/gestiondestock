package com.ldnr.guillaumes.gestiondestock.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ldnr.guillaumes.gestiondestock.model.Ventes;

public interface VentesRepository extends JpaRepository<Integer, Ventes>{

	Optional<Ventes> findVentesByCode(String code);
}
