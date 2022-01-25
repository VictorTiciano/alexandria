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

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.dto.ExemplarDTO;
import com.ufc.quixada.alexandria.services.ExemplarService;

@RestController
@RequestMapping(value = "/exemplares")
public class ExemplarController {

	@Autowired
	private ExemplarService service;
	
	@GetMapping
	public Page<ExemplarDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ExemplarDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping(value = "/add")
    public ExemplarDTO saveExemplar(@RequestBody ExemplarDTO dto) {
		ExemplarDTO exemplarDTO = service.salvar(dto);
		return exemplarDTO;
    }
	
}
