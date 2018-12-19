package br.ufc.pet.seven.evento;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Embeddable
public class Horario {

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "inicio_inscricao")
	private Date incioInscricao;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Column(name = "fim_inscricao")
	private Date fimInscricao;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date inicio;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date fim;
	
	
	public Horario(@NotNull Date incioInscricao, @NotNull Date fimInscricao, @NotNull Date inicio, @NotNull Date fim) {
		super();
		this.incioInscricao = incioInscricao;
		this.fimInscricao = fimInscricao;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Date getIncioInscricao() {
		return incioInscricao;
	}

	public void setIncioInscricao(Date incioInscricao) {
		this.incioInscricao = incioInscricao;
	}

	public Date getFimInscricao() {
		return fimInscricao;
	}

	public void setFimInscricao(Date fimInscricao) {
		this.fimInscricao = fimInscricao;
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
