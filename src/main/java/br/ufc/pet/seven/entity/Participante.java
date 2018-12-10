package br.ufc.pet.seven.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "participante")
public class Participante extends Usuario {

	@OneToMany
	private List<Inscricao> inscricao;

	public Participante() {
		
	}
	
	public Participante(List<Inscricao> inscricao) {
		super();
		this.inscricao = inscricao;
	}

	public List<Inscricao> getInscricao() {
		return inscricao;
	}

	public void setInscricao(List<Inscricao> inscricao) {
		this.inscricao = inscricao;
	}
	
	

}
