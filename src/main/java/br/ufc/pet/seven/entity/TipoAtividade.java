package br.ufc.pet.seven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tipo_atividade")
public class TipoAtividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@NotNull
	private String tipo_atividade;
	
	public TipoAtividade(@NotNull String tipo_atividade) {
		super();
		this.tipo_atividade = tipo_atividade;
	}

	public String getTipo_atividade() {
		return tipo_atividade;
	}

	public void setTipo_atividade(String tipo_atividade) {
		this.tipo_atividade = tipo_atividade;
	}

	public int getId() {
		return id;
	}
}

