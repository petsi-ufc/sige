package br.ufc.pet.seven.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "inscricao")
public class Inscricao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@NotNull
	private Date data_criacao;
	
	private boolean status_credenciamento = false;
	
	@ManyToOne
	private Participante participante;
	
	@OneToMany
	private List<Presenca> presenca;
	
	@ManyToOne
	private Atividade atividade;

	public Inscricao() {
		
	}
	
	public Inscricao(Participante participante, List<Presenca> presenca, Atividade atividade) {
		super();
		this.participante = participante;
		this.presenca = presenca;
		this.atividade = atividade;
	}

	public int getId() {
		return id;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public boolean isStatus_credenciamento() {
		return status_credenciamento;
	}

	public void setStatus_credenciamento(boolean status_credenciamento) {
		this.status_credenciamento = status_credenciamento;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public List<Presenca> getPresenca() {
		return presenca;
	}

	public void setPresenca(List<Presenca> presenca) {
		this.presenca = presenca;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

}
