package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.LivroDTO;
import com.ufc.quixada.alexandria.entities.Livro;
import com.ufc.quixada.alexandria.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	@Transactional(readOnly = true)
	public Page<LivroDTO> findAll(Pageable pageable) {
		Page<Livro> result = repository.findAll(pageable);
		Page<LivroDTO> page = result.map(x -> new LivroDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public LivroDTO findById(Long id) {
		Livro result = repository.findById(id).get();
		LivroDTO dto = new LivroDTO(result);
		return dto;
	}

}
