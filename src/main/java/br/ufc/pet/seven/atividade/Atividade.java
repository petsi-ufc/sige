package br.ufc.pet.seven.atividade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.ufc.pet.seven.evento.Evento;
import br.ufc.pet.seven.sessao.Sessao;
import br.ufc.pet.seven.usuario.Usuario;

@Entity
@Table(name = "atividade")
public class Atividade {

	private static final String PALESTRA = "palestra";
	private static final String MINICURSO = "minicurso";
	private static final String MESA_REDONDA = "mesa_redonda";
	private static final String HACKATHON = "hackathon";
	private static final String OFICINA = "oficina";
	private static final String EXPOSICAO = "exposicao";
	private static final String APRESENTACAO = "apresentacao";
	private static final String WORKSHOP = "workshop";
	private static final String OUTROS = "outros";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial", updatable = false, nullable = false)
	private long id;

	private String localizacao;

	@NotNull
	private String nome;

	@ManyToOne
	@NotNull
	private Evento evento;

	@NotNull
	private int vagas;

	@NotNull
	@Column(name = "tipo_atividade")
	private String tipoAtividade;

	@ManyToOne
	@NotNull
	private Usuario responsavel;

	@OneToMany
	@JoinColumn(name = "atividade_id")
	@NotNull
	private List<Sessao> sessoes;

	@ManyToMany
	private List<Usuario> inscritos;

	@Column(name = "aceita_inscricao", nullable = false, columnDefinition = "boolean default true")
	private boolean aceitaInscricao = true;
	
	@Column(name = "certificado_liberado", nullable = false, columnDefinition = "boolean default false")
	private boolean certificadoLiberado = false;
	
	public Atividade() {

	}

	public Atividade(String localizacao, @NotNull String nome, Evento evento, @NotNull int vagas,
			@NotNull String tipoAtividade, @NotNull Usuario responsavel, @NotNull List<Sessao> sessoes) {
		super();
		this.localizacao = localizacao;
		this.nome = nome;
		this.evento = evento;
		this.vagas = vagas;
		this.tipoAtividade = tipoAtividade;
		this.responsavel = responsavel;
		this.sessoes = sessoes;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public boolean isAceitaInscricao() {
		return aceitaInscricao;
	}

	public void setAceitaInscricao(boolean aceitaInscricao) {
		this.aceitaInscricao = aceitaInscricao;
	}

	public boolean isCertificadoLiberado() {
		return certificadoLiberado;
	}

	public void setCertificadoLiberado(boolean certificadoLiberado) {
		this.certificadoLiberado = certificadoLiberado;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public List<Sessao> getSessoes() {
		return sessoes;
	}

	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}

	public List<Usuario> getInscricao() {
		return inscritos;
	}

	public void setInscricao(List<Usuario> inscricao) {
		this.inscritos = inscricao;
	}

	public static String getPalestra() {
		return PALESTRA;
	}

	public static String getMinicurso() {
		return MINICURSO;
	}

	public static String getMesaRedonda() {
		return MESA_REDONDA;
	}

	public static String getHackathon() {
		return HACKATHON;
	}

	public static String getOficina() {
		return OFICINA;
	}

	public static String getExposicao() {
		return EXPOSICAO;
	}

	public static String getApresentacao() {
		return APRESENTACAO;
	}

	public static String getWorkshop() {
		return WORKSHOP;
	}

	public static String getOutros() {
		return OUTROS;
	}

	public long getId() {
		return id;
	}

}
