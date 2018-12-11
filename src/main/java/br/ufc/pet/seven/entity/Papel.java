package br.ufc.pet.seven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Papel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@NotNull
	private String papel;
	
	@NotNull
	private String descricao;

	public Papel() {
		
	}
	
	public Papel(@NotNull String papel, @NotNull String descricao) {
		super();
		this.papel = papel;
		this.descricao = descricao;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}
	
//	ADMINISTRADOR("administrador"),
//	ORGANIZADOR("organizador"),
//	AUXILIAR("auxiliar"),
//	RESPONSAVEL_ATIVIDADE("responsavel_atividade"),
//	PARTICIPANTE("participante");	
	
}
