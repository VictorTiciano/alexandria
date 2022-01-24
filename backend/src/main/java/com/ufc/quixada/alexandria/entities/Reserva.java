package com.ufc.quixada.alexandria.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

	@EmbeddedId
	private ReservaPK id = new ReservaPK();
	private Date data_reserva;

	public Reserva() {
	}
	
	public void setExemplar(Exemplar exemplar) {
		id.setExemplar(exemplar);
	}
	
	public void setCliente(Cliente cliente) {
		id.setCliente(cliente);
	}

	public ReservaPK getId() {
		return id;
	}

	public void setId(ReservaPK id) {
		this.id = id;
	}

	public Date getData_reserva() {
		return data_reserva;
	}

	public void setData_reserva(Date data_reserva) {
		this.data_reserva = data_reserva;
	}

	
}
