package br.ufc.pet.seven.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "responsavel_atividade")
public class Responsavel_Atividade extends Usuario {

	@OneToMany
	private List<Atividade> atividade;

	public Responsavel_Atividade() {
		
	}
	
	public Responsavel_Atividade(List<Atividade> atividade) {
		super();
		this.atividade = atividade;
	}

	public List<Atividade> getAtividade() {
		return atividade;
	}

	public void setAtividade(List<Atividade> atividade) {
		this.atividade = atividade;
	}
	
	

}
