package com.ufc.quixada.alexandria.dto;

import com.ufc.quixada.alexandria.entities.Administrador;

public class AdministradorDTO {

	private Long id;
	private Long biblioteca_id;
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private BibliotecaDTO biblioteca;
	
	public AdministradorDTO() {
	}

	
	
	public AdministradorDTO(Long id, Long biblioteca_id, String nome, String cpf, String endereco, String email,
			BibliotecaDTO biblioteca) {
		this.id = id;
		this.biblioteca_id = biblioteca_id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.biblioteca = biblioteca;
	}



	public AdministradorDTO(Administrador administrador) {
		id = administrador.getId();
		biblioteca_id = administrador.getBiblioteca().getId();
		nome = administrador.getNome();
		cpf = administrador.getCpf();
		endereco = administrador.getEndereco();
		email = administrador.getEmail();
		biblioteca = new BibliotecaDTO(administrador.getBiblioteca());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BibliotecaDTO getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(BibliotecaDTO biblioteca) {
		this.biblioteca = biblioteca;
	}

	public Long getBiblioteca_id() {
		return biblioteca_id;
	}

	public void setBiblioteca_id(Long biblioteca_id) {
		this.biblioteca_id = biblioteca_id;
	}

}
