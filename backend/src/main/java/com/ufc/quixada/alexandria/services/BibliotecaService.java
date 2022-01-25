package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.BibliotecaDTO;
import com.ufc.quixada.alexandria.entities.Biblioteca;
import com.ufc.quixada.alexandria.repositories.BibliotecaRepository;

@Service
public class BibliotecaService {

	@Autowired
	private BibliotecaRepository repository;
	
	@Transactional(readOnly = true)
	public Page<BibliotecaDTO> findAll(Pageable pageable) {
		Page<Biblioteca> result = repository.findAll(pageable);
		Page<BibliotecaDTO> page = result.map(x -> new BibliotecaDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public BibliotecaDTO findById(Long id) {
		Biblioteca result = repository.findById(id).get();
		BibliotecaDTO dto = new BibliotecaDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public BibliotecaDTO salvar(BibliotecaDTO dto) {
		
		Biblioteca biblioteca;
		
		biblioteca = new Biblioteca();
		biblioteca.setCnpj(dto.getCnpj());
		biblioteca.setNome(dto.getNome());
		biblioteca.setEndereco(dto.getEndereco());
		biblioteca = repository.save(biblioteca);
		
		return new BibliotecaDTO(biblioteca);
	}
	
	@Transactional
	public void deletar(Long id) {
			repository.deleteById(id);
	}
	
}
