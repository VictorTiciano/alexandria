package com.ufc.quixada.alexandria.dto;

import com.ufc.quixada.alexandria.entities.Cliente;

public class ClienteDTO {

	private Long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(Long id, String nome, String cpf, String endereco, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
	}
	
	public ClienteDTO(Cliente cliente) {
		id = cliente.getId();
		nome = cliente.getNome();
		cpf = cliente.getCpf();
		endereco = cliente.getEndereco();
		email = cliente.getEmail();
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

	@Override
	public String toString() {
		return "ClienteDTO [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email="
				+ email + "]";
	}
	
}
