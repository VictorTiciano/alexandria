package com.ufc.quixada.alexandria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.quixada.alexandria.dto.EmprestimoDTO;
import com.ufc.quixada.alexandria.entities.EmprestimoPK;
import com.ufc.quixada.alexandria.services.EmprestimoService;


@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimoController {
	
	@Autowired
	private EmprestimoService emprestimoService;
	
	@GetMapping
	public Page<EmprestimoDTO> findAll(Pageable pageable){
		return emprestimoService.findAll(pageable);
	}
	
	@PostMapping(value = "/add")
	public EmprestimoDTO saveEmprestimo(@RequestBody EmprestimoDTO dto) {
		
		EmprestimoDTO emprestimo = emprestimoService.saveEmprestimo(dto);
		return emprestimo;
		
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletarEmprestimo(@PathVariable EmprestimoPK id) {
		emprestimoService.deletar(id);
	}

}
