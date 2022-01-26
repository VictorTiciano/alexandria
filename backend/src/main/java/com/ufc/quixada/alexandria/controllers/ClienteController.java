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

import com.ufc.quixada.alexandria.dto.ClienteDTO;
import com.ufc.quixada.alexandria.repositories.ClienteRepository;
import com.ufc.quixada.alexandria.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public Page<ClienteDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id){
		boolean existsCliente = repository.existsById(id);
		
		if(existsCliente) {
			ClienteDTO cl = new ClienteDTO(repository.findById(id).get());
			service.findById(id);
			return ResponseEntity.ok(cl);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping(value = "/add")
    public ResponseEntity<Object> saveCliente(@RequestBody ClienteDTO dto) {
		boolean existsCpf = repository.existsByCpf(dto.getCpf());
		boolean existsEmail = repository.existsByEmail(dto.getEmail());
		if(existsCpf) {
			return ResponseEntity.badRequest().body("CPF já cadastrado");
		}
		if(existsEmail) {
			return ResponseEntity.badRequest().body("Email já cadastrado");
		}
		service.salvar(dto);
		return ResponseEntity.ok("Cliente registrado com sucesso");
    }
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletarCliente(@PathVariable Long id) {
		boolean existsCliente = repository.existsById(id);
		if(existsCliente) {
			service.deletar(id);
			return ResponseEntity.ok("Cliente deletado com sucesso");
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Object> atualizarCliente( @RequestBody ClienteDTO dto, @PathVariable Long id) {
		boolean existsCliente = repository.existsById(id);
		
		if(existsCliente) {
			service.atualizar(dto, id);
			return ResponseEntity.ok("Cliente atualizado com sucesso");
		}
		
		return ResponseEntity.notFound().build();
	}

}
