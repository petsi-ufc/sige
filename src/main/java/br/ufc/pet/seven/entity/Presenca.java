package br.ufc.pet.seven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "presenca")
public class Presenca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	private boolean presenca = false;
	
	// definir se é necessário ter a classe presença (poderia juntar com sessao e levar apenas o boolean para lá)
	@ManyToOne
	private Sessao sessao;
	
	public Presenca(Sessao sessao) {
		super();
		this.sessao = sessao;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public int getId() {
		return id;
	}
}
