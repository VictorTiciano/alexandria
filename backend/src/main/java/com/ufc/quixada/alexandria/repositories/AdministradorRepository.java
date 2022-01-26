package com.ufc.quixada.alexandria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.quixada.alexandria.entities.Administrador;

public interface AdministradorRepository extends JpaRepository< Administrador, Long>{
	boolean existsByCpf(String cpf);
	
	boolean existsByEmail(String email);
}
