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

import com.ufc.quixada.alexandria.dto.ClienteDTO;
import com.ufc.quixada.alexandria.entities.Cliente;
import com.ufc.quixada.alexandria.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping
	public Page<ClienteDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ClienteDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping(value = "/add")
    public ClienteDTO saveCliente(@RequestBody ClienteDTO dto) {
		ClienteDTO clienteDTO = service.salvar(dto);
		return clienteDTO;
    }
	
	@DeleteMapping(value = "/{id}")
	public void deletarCliente(@PathVariable Long id) {
		service.deletar(id);
	}
	
	@PutMapping(value = "/{id}")
	public void atualizarCliente( @RequestBody ClienteDTO dto, @PathVariable Long id) {
		service.atualizar(dto, id);
	}

}
