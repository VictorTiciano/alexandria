package com.ufc.quixada.alexandria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.quixada.alexandria.dto.BibliotecaDTO;
import com.ufc.quixada.alexandria.dto.ClienteDTO;
import com.ufc.quixada.alexandria.services.BibliotecaService;

@RestController
@RequestMapping(value = "/bibliotecas")
public class BibliotecaController {

	@Autowired
	private BibliotecaService service;
	
	
	@GetMapping
	public Page<BibliotecaDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	@GetMapping(value = "/{id}")
	public BibliotecaDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping(value = "/add")
    public BibliotecaDTO saveCliente(@RequestBody BibliotecaDTO dto) {
		BibliotecaDTO bibliotecaDTO = service.salvar(dto);
		return bibliotecaDTO;
    }
	
}
