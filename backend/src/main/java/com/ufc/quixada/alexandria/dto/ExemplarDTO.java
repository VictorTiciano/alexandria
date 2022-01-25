package com.ufc.quixada.alexandria.dto;

import com.ufc.quixada.alexandria.entities.Exemplar;
import com.ufc.quixada.alexandria.entities.Livro;

public class ExemplarDTO {

	private Long id;
	private Long livro_id;
	private LivroDTO livro;
	
	public ExemplarDTO(){
	}

	public ExemplarDTO(Long id, Long livro_id, LivroDTO livro) {
		this.id = id;
		this.livro_id = livro_id;
		this.livro = livro;
	}

	public ExemplarDTO(Exemplar exemplar) {
		id = exemplar.getId();
		livro_id = exemplar.getLivro().getId();
		livro = new LivroDTO(exemplar.getLivro());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLivro_id() {
		return livro_id;
	}

	public void setLivro_id(Long livro_id) {
		this.livro_id = livro_id;
	}

	public LivroDTO getLivro() {
		return livro;
	}

	public void setLivro(LivroDTO livro) {
		this.livro = livro;
	}
	
}
