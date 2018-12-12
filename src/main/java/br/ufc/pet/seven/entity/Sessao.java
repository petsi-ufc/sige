package br.ufc.pet.seven.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sessao")
public class Sessao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date inicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date fim;
	
	public Sessao() {
		
	}
	
	public Sessao(@NotNull Date inicio, @NotNull Date fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public int getId() {
		return id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	
	public Date getFim() {
		return fim;
	}
	
	public void setFim(Date fim) {
		this.fim = fim;
	}	
}
