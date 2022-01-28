package com.ufc.quixada.alexandria.entities;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {
	
	@EmbeddedId
	private EmprestimoPK id = new EmprestimoPK();
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;

	public Emprestimo() {
	}
	
	public void setCliente(Cliente cliente) {
		id.setCliente(cliente);
	}
	
	public void setExemplar(Exemplar exemplar) {
		id.setExemplar(exemplar);
	}

	public EmprestimoPK getId() {
		return id;
	}

	public void setId(EmprestimoPK id) {
		this.id = id;
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
