package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.dto.BibliotecaDTO;
import com.ufc.quixada.alexandria.dto.ClienteDTO;
import com.ufc.quixada.alexandria.entities.Administrador;
import com.ufc.quixada.alexandria.entities.Biblioteca;
import com.ufc.quixada.alexandria.entities.Cliente;
import com.ufc.quixada.alexandria.repositories.AdministradorRepository;
import com.ufc.quixada.alexandria.repositories.BibliotecaRepository;

@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorRepository repository;
	
	@Autowired
	private BibliotecaRepository bibliotecaRepository;

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
	
	@Transactional(readOnly = true)
	public AdministradorDTO salvar(AdministradorDTO dto) {
		
		Administrador administrador;
		Biblioteca biblioteca = bibliotecaRepository.findById(dto.getBiblioteca_id()).get();
        
		administrador = new Administrador();
		administrador.setNome(dto.getNome());
		administrador.setCpf(dto.getCpf());
		administrador.setEndereco(dto.getEndereco());
		administrador.setEmail(dto.getEmail());
		administrador.setBiblioteca(biblioteca);
		administrador = repository.save(administrador);	
 
        return new AdministradorDTO(administrador);
    }
	
	@Transactional
	public void deletar(Long id) {
			repository.deleteById(id);
	}
	
}
