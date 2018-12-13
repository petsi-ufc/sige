package br.ufc.pet.seven.evento;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import br.ufc.pet.seven.atividade.Atividade;
import br.ufc.pet.seven.usuario.Usuario;

@Entity
@Table(name = "evento")
@Component
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;

	@NotNull
	private String nome;

	private String sigla;
	private String area;
	private String localizacao;
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
	@NotNull
	private Usuario organizador;

	@OneToMany
	@JoinColumn(name = "evento_id")
	private List<Atividade> atividades;

	public Evento() {

	}

	public Evento(@NotNull String nome, String sigla, String area, String localizacao, String descricao, 
			@NotNull Date incio_inscricao, @NotNull Date fim_inscricao, @NotNull Date inicio, @NotNull Date fim) {
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

	public int getId() {
		return id;
	}

}
