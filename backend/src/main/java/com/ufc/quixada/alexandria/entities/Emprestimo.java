package com.ufc.quixada.alexandria.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo {
	
	@EmbeddedId
	private EmprestimoPK id = new EmprestimoPK();
	private Date data_dev;

	public Emprestimo() {
	}
	
	public void setExemplar(Exemplar exemplar) {
		id.setExemplar(exemplar);
	}
	
	public void setCliente(Cliente cliente) {
		id.setCliente(cliente);
	}

	public EmprestimoPK getId() {
		return id;
	}

	public void setId(EmprestimoPK id) {
		this.id = id;
	}

	public Date getData_dev() {
		return data_dev;
	}

	public void setData_dev(Date data_dev) {
		this.data_dev = data_dev;
	}

}
