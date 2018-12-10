package br.ufc.pet.seven.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String sigla;
	
	@NotNull
	private String area;
	
	@NotNull
	private String localizacao;
	
	@NotNull
	private String descricao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date incio_inscricao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date fim_inscricao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date inicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date fim;
	
	private boolean status = true;
	
	@ManyToOne
	private Organizador organizador;
	
	@OneToMany
	private List<Atividade> atividade;
	
	@ManyToMany
	private List<Auxiliar> auxiliar;

	public Evento() {
		
	}
	
	public Evento(@NotNull String nome, @NotNull String sigla, @NotNull String area,
			@NotNull String localizacao, @NotNull String descricao, @NotNull Date incio_inscricao,
			@NotNull Date fim_inscricao, @NotNull Date inicio, @NotNull Date fim, Organizador organizador) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.area = area;
		this.localizacao = localizacao;
		this.descricao = descricao;
		this.incio_inscricao = incio_inscricao;
		this.fim_inscricao = fim_inscricao;
		this.inicio = inicio;
		this.fim = fim;
		this.organizador = organizador;
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

	public Date getIncio_inscricao() {
		return incio_inscricao;
	}

	public void setIncio_inscricao(Date incio_inscricao) {
		this.incio_inscricao = incio_inscricao;
	}

	public Date getFim_inscricao() {
		return fim_inscricao;
	}

	public void setFim_inscricao(Date fim_inscricao) {
		this.fim_inscricao = fim_inscricao;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Organizador getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	public List<Atividade> getAtividade() {
		return atividade;
	}

	public void setAtividade(List<Atividade> atividade) {
		this.atividade = atividade;
	}

	public List<Auxiliar> getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(List<Auxiliar> auxiliar) {
		this.auxiliar = auxiliar;
	}

	public int getId() {
		return id;
	}
}
