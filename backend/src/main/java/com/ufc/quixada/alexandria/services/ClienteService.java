package com.ufc.quixada.alexandria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.ClienteDTO;
import com.ufc.quixada.alexandria.entities.Cliente;
import com.ufc.quixada.alexandria.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClienteDTO> findAll(Pageable pageable) {
		Page<Cliente> result = repository.findAll(pageable);
		Page<ClienteDTO> page = result.map(x -> new ClienteDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente result = repository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(result);
		return dto;
	}
}
