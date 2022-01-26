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
import com.ufc.quixada.alexandria.dto.BibliotecaDTO;
import com.ufc.quixada.alexandria.entities.Biblioteca;
import com.ufc.quixada.alexandria.repositories.BibliotecaRepository;
import com.ufc.quixada.alexandria.services.AdministradorService;
import com.ufc.quixada.alexandria.services.BibliotecaService;


@RestController
@RequestMapping(value = "/bibliotecas")
public class BibliotecaController {

	@Autowired
	private BibliotecaService service;
	
	@Autowired
	private BibliotecaRepository repository;
	
	@Autowired
	private AdministradorService administradorService;
	
	@GetMapping
	public Page<BibliotecaDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id){
		
		boolean existsBiblioteca = repository.existsById(id);
		
		if(existsBiblioteca) {
			BibliotecaDTO biblioteca = new BibliotecaDTO(repository.findById(id).get());
			service.findById(id);
			return ResponseEntity.ok(biblioteca);
		}
		
		return ResponseEntity.notFound().build();
		
	}
	
	@PostMapping(value = "/add")
    public ResponseEntity<Object> saveBiblioteca(@RequestBody BibliotecaDTO dto) {
		
		boolean existsCnpj = repository.existsByCnpj(dto.getCnpj());
		
		if(existsCnpj) {
			return ResponseEntity.badRequest().body("Biblioteca já está cadastrado");
		}
		service.salvar(dto);
		return ResponseEntity.created(null).body("Biblioteca cadastrado com sucesso.") ;
    }
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletar(@PathVariable Long id) {
		
		boolean existsBiblioteca = repository.existsById(id);
		
		if(existsBiblioteca) {
			Biblioteca biblioteca = repository.findById(id).get();
			AdministradorDTO administrador = administradorService.findById(id);
			if(biblioteca.getId() == administrador.getBiblioteca_id()) {
				return ResponseEntity.badRequest().body("Erro 1");
			}
			if(true) {
			}
			service.deletar(id);
            return ResponseEntity.ok("Cliente deletado com sucesso");
        }
        return ResponseEntity.notFound().build();
	}
	
	@PutMapping(value = "/{id}")
	public BibliotecaDTO atualizarBiblioteca( @RequestBody BibliotecaDTO dto, @PathVariable Long id) {
		BibliotecaDTO biblioteca = service.atualizar(dto, id);
		return biblioteca;
	}
	
}
