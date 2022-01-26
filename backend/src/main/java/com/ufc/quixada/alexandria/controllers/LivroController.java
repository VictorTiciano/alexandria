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
import com.ufc.quixada.alexandria.dto.LivroDTO;
import com.ufc.quixada.alexandria.repositories.LivroRepository;
import com.ufc.quixada.alexandria.services.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

	@Autowired
	private LivroService service;
	
	@Autowired
	private LivroRepository respository;
	
	@GetMapping
	public Page<LivroDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id){
		boolean existsLivro = respository.existsById(id);
		
		if(existsLivro) {
			LivroDTO cl = new LivroDTO(respository.findById(id).get());
			service.findById(id);
			return ResponseEntity.ok(cl);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping(value = "/add")
    public ResponseEntity<Object> saveLivro(@RequestBody LivroDTO dto) {
		boolean existsIsbn = respository.existsByIsbn(dto.getIsbn());
		
		if(existsIsbn) {
			return ResponseEntity.badRequest().body("ISBN já cadastrado.");
		}
		service.salvar(dto);
		return ResponseEntity.ok("Livro cadastrado com sucesso.");
    }
	
	@PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateLivro(@RequestBody LivroDTO dto, @PathVariable Long id) {
		boolean existsLivro = respository.existsById(id);
		
		if(existsLivro) {
			service.atualizar(dto, id);
			return ResponseEntity.ok("Livro atualizado com sucesso");
		}
		
		return ResponseEntity.notFound().build();
    }
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletarCliente(@PathVariable Long id) {
		boolean existsLivro = respository.existsById(id);
		if(existsLivro) {
			service.deletar(id);
			return ResponseEntity.ok("Livro deletado com sucesso");
		}
		return ResponseEntity.notFound().build();
	}
	
}
