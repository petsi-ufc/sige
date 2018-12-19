package br.ufc.pet.seven.evento;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.ufc.pet.seven.atividade.Atividade;
import br.ufc.pet.seven.usuario.Usuario;

@Entity
@Table(name = "evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial", updatable = false, nullable = false)
	private long id;

	@NotNull
	private String nome;

	private String sigla;
	private String area;
	private String localizacao;
	private String descricao;

	private boolean status = true;

	@ManyToOne
	private Usuario organizador;

	@OneToMany
	@JoinColumn(name = "evento_id")
	private List<Atividade> atividades;
	
	@NotNull
	private Horario horario;

	public Evento() {

	}

	public Evento(@NotNull String nome, String sigla, String area, String localizacao, String descricao, @NotNull Horario horario) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.area = area;
		this.localizacao = localizacao;
		this.descricao = descricao;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public long getId() {
		return id;
	}

}
