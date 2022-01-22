package com.ufc.quixada.alexandria.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String subtitulo;
	private String autor;
	private Integer isbn;
	private String assunto;
	private Integer n_edicao;
	private String editora;
	private Date ano_publicacao;
	private Integer n_pagina;
	private Integer quatidade;
	
	@ManyToOne
	@JoinColumn(name = "biblioteca_id") 
	private Biblioteca biblioteca;
	
	public Livro() {
		
	}

	

	public Livro(Long id, String titulo, String subtitulo, String autor, Integer isbn, String assunto, Integer n_edicao,
			String editora, Date ano_publicacao, Integer n_pagina, Integer quatidade, Biblioteca biblioteca) {
		this.id = id;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.autor = autor;
		this.isbn = isbn;
		this.assunto = assunto;
		this.n_edicao = n_edicao;
		this.editora = editora;
		this.ano_publicacao = ano_publicacao;
		this.n_pagina = n_pagina;
		this.quatidade = quatidade;
		this.biblioteca = biblioteca;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Integer getN_edicao() {
		return n_edicao;
	}

	public void setN_edicao(Integer n_edicao) {
		this.n_edicao = n_edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}

	public Integer getN_pagina() {
		return n_pagina;
	}

	public void setN_pagina(Integer n_pagina) {
		this.n_pagina = n_pagina;
	}

	public Integer getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(Integer quatidade) {
		this.quatidade = quatidade;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	
}
