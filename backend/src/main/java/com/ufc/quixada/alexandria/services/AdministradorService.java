package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.entities.Administrador;

import com.ufc.quixada.alexandria.repositories.AdministradorRepository;

@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorRepository repository;

	@Transactional(readOnly = true)
	public Page<AdministradorDTO> findAll(Pageable pageable) {
		Page<Administrador> result = repository.findAll(pageable);
		Page<AdministradorDTO> page = result.map(x -> new AdministradorDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public AdministradorDTO findById(Long id) {
		Administrador result = repository.findById(id).get();
		AdministradorDTO dto = new AdministradorDTO(result);
		return dto;
	}
	
}
