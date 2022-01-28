package com.ufc.quixada.alexandria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.quixada.alexandria.entities.Emprestimo;
import com.ufc.quixada.alexandria.entities.EmprestimoPK;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, EmprestimoPK>{
	
}
