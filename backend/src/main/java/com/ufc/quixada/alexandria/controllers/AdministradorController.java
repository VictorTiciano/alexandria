package com.ufc.quixada.alexandria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.services.AdministradorService;

@RestController
@RequestMapping(value = "/administradores")
public class AdministradorController {

	@Autowired
	private AdministradorService service;
	
	@GetMapping
	public Page<AdministradorDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public AdministradorDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping(value = "/add")
    public AdministradorDTO saveAdministrador(@RequestBody AdministradorDTO dto) {
		AdministradorDTO administradorDTO = service.salvar(dto);
		return administradorDTO;
    }
	
	@DeleteMapping(value = "/{id}")
	public void deletarCliente(@PathVariable Long id) {
		service.deletar(id);
	}
	
	@PutMapping(value = "/{id}")
	public AdministradorDTO atualizarCliente( @RequestBody AdministradorDTO dto, @PathVariable Long id) {
		AdministradorDTO administradorDTO = service.atualizar(dto, id);
		return administradorDTO;
	}
	
}
