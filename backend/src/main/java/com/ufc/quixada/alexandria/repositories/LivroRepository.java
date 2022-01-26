package com.ufc.quixada.alexandria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.quixada.alexandria.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	boolean existsByIsbn(String isbn);
}
