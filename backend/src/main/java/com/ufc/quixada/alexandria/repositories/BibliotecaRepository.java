package com.ufc.quixada.alexandria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.quixada.alexandria.entities.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {

	boolean existsByCnpj(String cnpj);
	
}
