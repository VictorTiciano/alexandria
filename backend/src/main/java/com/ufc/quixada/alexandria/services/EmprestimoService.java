package com.ufc.quixada.alexandria.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufc.quixada.alexandria.dto.EmprestimoDTO;
import com.ufc.quixada.alexandria.entities.Cliente;
import com.ufc.quixada.alexandria.entities.Emprestimo;
import com.ufc.quixada.alexandria.entities.EmprestimoPK;
import com.ufc.quixada.alexandria.entities.Exemplar;

import com.ufc.quixada.alexandria.repositories.ClienteRepository;
import com.ufc.quixada.alexandria.repositories.EmprestimoRepository;
import com.ufc.quixada.alexandria.repositories.ExemplarRepository;


@Service
public class EmprestimoService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ExemplarRepository exemplarRepository;
	
	@Autowired
	private EmprestimoRepository emprestimoRepository;
	
	@Transactional(readOnly = true)
	public Page<EmprestimoDTO> findAll(Pageable pageable) {
		Page<Emprestimo> result = emprestimoRepository.findAll(pageable);
		Page<EmprestimoDTO> page = result.map(x -> new EmprestimoDTO(x));
		return page;
	}
	
	@Transactional
	public EmprestimoDTO saveEmprestimo(EmprestimoDTO dto) {
		
		 Cliente cliente = clienteRepository.findById(dto.getClienteId()).get();
		 Exemplar exemplar = exemplarRepository.findById(dto.getExemplarId()).get();
		 LocalDate data = LocalDate.now();
		 
		 Emprestimo emprestimo = new Emprestimo();
		 emprestimo.setCliente(cliente);
		 emprestimo.setExemplar(exemplar);
		 emprestimo.setDataEmprestimo(data);
		 emprestimo.setDataDevolucao(data.plusDays(30));
		 
		 emprestimo = emprestimoRepository.save(emprestimo); 
		 
		 return new EmprestimoDTO(emprestimo);
	}
	
	@Transactional
	public void deletar(EmprestimoPK id) {
		emprestimoRepository.deleteById(id);
	}
}
