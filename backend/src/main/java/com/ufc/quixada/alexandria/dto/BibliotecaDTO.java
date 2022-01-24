package com.ufc.quixada.alexandria.dto;

import java.util.ArrayList;
import java.util.List;

import com.ufc.quixada.alexandria.entities.Biblioteca;
import com.ufc.quixada.alexandria.entities.Livro;

public class BibliotecaDTO {

	private Long id;
	private String cnpj;
	private String nome;
	private String endereco;
	
	public BibliotecaDTO(){
	}

	public BibliotecaDTO(Long id, String cnpj, String nome, String endereco) {
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
	}

	public BibliotecaDTO(Biblioteca biblioteca) {
		id = biblioteca.getId();
		cnpj = biblioteca.getCnpj();
		nome = biblioteca.getNome();
		endereco = biblioteca.getEndereco();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
