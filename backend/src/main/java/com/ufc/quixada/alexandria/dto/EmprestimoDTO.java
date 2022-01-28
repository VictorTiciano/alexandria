package com.ufc.quixada.alexandria.dto;

import java.time.LocalDate;

import com.ufc.quixada.alexandria.entities.Emprestimo;

public class EmprestimoDTO {

	private Long clienteId;
	private Long exemplarId;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	public EmprestimoDTO() {
	}
	
	

	public EmprestimoDTO(Long clienteId, Long exemplarId, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
		this.clienteId = clienteId;
		this.exemplarId = exemplarId;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}

	public EmprestimoDTO (Emprestimo emprestimo) {
		clienteId = emprestimo.getId().getCliente().getId();
		exemplarId = emprestimo.getId().getExemplar().getId();
		dataEmprestimo = emprestimo.getDataEmprestimo();
		dataDevolucao = emprestimo.getDataDevolucao();
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getExemplarId() {
		return exemplarId;
	}

	public void setExemplarId(Long exemplarId) {
		this.exemplarId = exemplarId;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
}
