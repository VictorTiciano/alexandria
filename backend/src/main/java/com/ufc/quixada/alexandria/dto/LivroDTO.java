package com.ufc.quixada.alexandria.dto;

import com.ufc.quixada.alexandria.entities.Livro;

public class LivroDTO {

	private Long id;
	private String titulo;
	private String subtitulo;
	private String autor;
	private String isbn;
	private String assunto;
	private Integer n_edicao;
	private String editora;
	private Integer ano_publicacao;
	private Integer n_pagina;
	private Integer quantidade;
	private BibliotecaDTO biblioteca; 
	
	public LivroDTO() {
	}
	
	public LivroDTO(Long id, String titulo, String subtitulo, String autor, String isbn, String assunto,
			Integer n_edicao, String editora, Integer ano_publicacao, Integer n_pagina, Integer quantidade,
			BibliotecaDTO biblioteca) {
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
		this.quantidade = quantidade;
		this.biblioteca = biblioteca;
	}

	public LivroDTO(Livro livro) {
		id = livro.getId();
		titulo = livro.getTitulo();
		subtitulo = livro.getSubtitulo();
		autor = livro.getAutor();
		isbn = livro.getIsbn();
		assunto = livro.getAssunto();
		n_edicao = livro.getN_edicao();
		editora = livro.getEditora();
		ano_publicacao = livro.getAno_publicacao();
		n_pagina = livro.getN_pagina();
		quantidade = livro.getQuatidade();
		biblioteca = new BibliotecaDTO(livro.getBiblioteca());
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
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

	public Integer getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(Integer ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}

	public Integer getN_pagina() {
		return n_pagina;
	}

	public void setN_pagina(Integer n_pagina) {
		this.n_pagina = n_pagina;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BibliotecaDTO getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(BibliotecaDTO biblioteca) {
		this.biblioteca = biblioteca;
	}
	
}
