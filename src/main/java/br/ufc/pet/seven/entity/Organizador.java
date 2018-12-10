package br.ufc.pet.seven.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "organizador")
public class Organizador extends Usuario {

	@OneToMany
	private List<Evento> evento;

	public Organizador() {
		
	}
	
	public Organizador(List<Evento> evento) {
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
