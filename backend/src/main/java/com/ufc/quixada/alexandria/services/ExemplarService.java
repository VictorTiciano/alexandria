package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.ExemplarDTO;
import com.ufc.quixada.alexandria.entities.Exemplar;
import com.ufc.quixada.alexandria.entities.Livro;
import com.ufc.quixada.alexandria.repositories.ExemplarRepository;
import com.ufc.quixada.alexandria.repositories.LivroRepository;

@Service
public class ExemplarService {

	@Autowired
	private ExemplarRepository repository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Transactional(readOnly = true)
	public Page<ExemplarDTO> findAll(Pageable pageable) {
		Page<Exemplar> result = repository.findAll(pageable);
		Page<ExemplarDTO> page = result.map(x -> new ExemplarDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public ExemplarDTO findById(Long id) {
		Exemplar result = repository.findById(id).get();
		ExemplarDTO dto = new ExemplarDTO(result);
		return dto;
	}
	
	@Transactional
	public ExemplarDTO salvar(ExemplarDTO dto) {
		
		Exemplar exemplar;
		Livro livro = livroRepository.findById(dto.getLivro_id()).get();
        
		exemplar = new Exemplar();
		exemplar.setLivro(livro);
		exemplar = repository.save(exemplar);	
 
        return new ExemplarDTO(exemplar);
    }
	
}
