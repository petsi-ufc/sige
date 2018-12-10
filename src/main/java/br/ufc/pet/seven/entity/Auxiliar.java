package br.ufc.pet.seven.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "auxiliar")
public class Auxiliar extends Usuario {

	@ManyToMany
	private List<Evento> evento;
	
	public Auxiliar() {
		
	}
	
	public Auxiliar(List<Evento> evento) {
		super();
		this.evento = evento;
	}

	public List<Evento> getEvento() {
		return evento;
	}

	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}
}
