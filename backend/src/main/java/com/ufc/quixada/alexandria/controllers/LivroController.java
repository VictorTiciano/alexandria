package com.ufc.quixada.alexandria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.dto.LivroDTO;
import com.ufc.quixada.alexandria.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

	@Autowired
	private LivroService service;
	
	@GetMapping
	public Page<LivroDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public LivroDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping(value = "/add")
    public LivroDTO saveLivro(@RequestBody LivroDTO dto) {
		LivroDTO livroDTO = service.salvar(dto);
		return livroDTO;
    }
	
	@PutMapping(value = "/atualizar")
    public LivroDTO updateLivro(@RequestBody LivroDTO dto) {
		LivroDTO livroDTO = service.atualizar(dto);
		return livroDTO;
    }
	
}
