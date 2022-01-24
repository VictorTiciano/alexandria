package com.ufc.quixada.alexandria.dto;

import com.ufc.quixada.alexandria.entities.Exemplar;
import com.ufc.quixada.alexandria.entities.Livro;

public class ExemplarDTO {

	private Long id;
	private LivroDTO livro;
	
	public ExemplarDTO(){
	}

	public ExemplarDTO(Long id, LivroDTO livro) {
		this.id = id;
		this.livro = livro;
	}
	
	public ExemplarDTO(Exemplar exemplar) {
		id = exemplar.getId();
		livro = new LivroDTO(exemplar.getLivro());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LivroDTO getLivro() {
		return livro;
	}

	public void setLivro(LivroDTO livro) {
		this.livro = livro;
	}
	
}
