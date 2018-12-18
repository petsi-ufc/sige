package br.ufc.pet.seven.sessao;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.ufc.pet.seven.atividade.Atividade;
import br.ufc.pet.seven.usuario.Usuario;

@Entity
@Table(name = "sessao")
public class Sessao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial", updatable = false, nullable = false)
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date inicio;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date fim;

	@ManyToOne
	@NotNull
	private Atividade atividade;

	@ManyToMany
	private List<Usuario> presentes;

	public Sessao() {

	}

	public Sessao(@NotNull Date inicio, @NotNull Date fim, @NotNull Atividade atividade, List<Usuario> presentes) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.atividade = atividade;
		this.presentes = presentes;
	}

	public Sessao(@NotNull Date inicio, @NotNull Date fim, @NotNull Atividade atividade) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.atividade = atividade;
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

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public List<Usuario> getPresentes() {
		return presentes;
	}

	public void setPresentes(List<Usuario> presentes) {
		this.presentes = presentes;
	}

	public long getId() {
		return id;
	}

}
