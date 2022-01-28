package com.ufc.quixada.alexandria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.quixada.alexandria.dto.AdministradorDTO;
import com.ufc.quixada.alexandria.repositories.AdministradorRepository;
import com.ufc.quixada.alexandria.services.AdministradorService;

@RestController
@RequestMapping(value = "/administradores")
public class AdministradorController {

	@Autowired
	private AdministradorService service;
	
	@Autowired
	private AdministradorRepository repository;
	
	@GetMapping
	public Page<AdministradorDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id){
		boolean existsAdm = repository.existsById(id);
		
		if(existsAdm) {
			AdministradorDTO adm = new AdministradorDTO(repository.findById(id).get());
			service.findById(id);
			return ResponseEntity.ok(adm);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping(value = "/add")
    public ResponseEntity<Object> saveAdministrador(@RequestBody AdministradorDTO dto) {
		boolean existsCpf = repository.existsByCpf(dto.getCpf());
		boolean existsEmail = repository.existsByEmail(dto.getEmail());
		if(existsCpf) {
			return ResponseEntity.badRequest().body("CPF já cadastrado");
		}
		if(existsEmail) {
			return ResponseEntity.badRequest().body("Email já cadastrado");
		}
		service.salvar(dto);
		return ResponseEntity.ok("Administrador registrado com sucesso");
    }
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletarAdministrador(@PathVariable Long id) {
		boolean existsAdm = repository.existsById(id);
		if(existsAdm) {
			service.deletar(id);
			return ResponseEntity.ok("Administrador deletado com sucesso");
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Object> atualizar( @RequestBody AdministradorDTO dto, @PathVariable Long id) {
		boolean existsAdm = repository.existsById(id);
		
		if(existsAdm) {
			service.atualizar(dto, id);
			return ResponseEntity.ok("Administrador atualizado com sucesso");
		}
		
		return ResponseEntity.notFound().build();
	}
	
}
