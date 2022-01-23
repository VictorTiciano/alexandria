package com.ufc.quixada.alexandria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.quixada.alexandria.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
