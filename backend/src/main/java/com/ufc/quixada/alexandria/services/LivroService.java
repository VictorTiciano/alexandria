package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.dto.LivroDTO;
import com.ufc.quixada.alexandria.entities.Administrador;
import com.ufc.quixada.alexandria.entities.Biblioteca;
import com.ufc.quixada.alexandria.entities.Livro;
import com.ufc.quixada.alexandria.repositories.BibliotecaRepository;
import com.ufc.quixada.alexandria.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private BibliotecaRepository bibliotecaRepository;
	
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
	
	@Transactional(readOnly = true)
	public LivroDTO salvar(LivroDTO dto) {
		
		Livro livro;
		Biblioteca biblioteca = bibliotecaRepository.findById(dto.getBiblioteca_id()).get();
        
		livro = new Livro();
		livro.setTitulo(dto.getTitulo());
		livro.setSubtitulo(dto.getSubtitulo());
		livro.setAutor(dto.getAutor());
		livro.setIsbn(dto.getIsbn());
		livro.setAssunto(dto.getAssunto());
		livro.setN_edicao(dto.getN_edicao());
		livro.setEditora(dto.getEditora());
		livro.setAno_publicacao(dto.getAno_publicacao());
		livro.setN_pagina(dto.getN_pagina());
		livro.setQuatidade(dto.getQuantidade());
		livro.setBiblioteca(biblioteca);
		livro = repository.save(livro);	
		
		return new LivroDTO(livro);
    }
	
	@Transactional
	public void deletar(Long id) {
			repository.deleteById(id);
	}

}
