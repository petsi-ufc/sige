package br.ufc.pet.seven.atividade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(updatable = false, nullable = false)
	private int id;

	@NotNull
	private String localizacao;

	@NotNull
	private String nome;

	@ManyToOne
	private Evento evento;

	@NotNull
	private int vagas;

	@NotNull
	private String tipo_atividade;

	private boolean aceita_inscricao = true;
	private boolean certificado_liberado = false;

	@ManyToOne
	@NotNull
	private Usuario responsavel;

	@OneToMany
	@NotNull
	private List<Sessao> sessoes;

	@OneToMany
	@NotNull
	private List<Usuario> inscritos;

	public Atividade() {

	}

	public Atividade(@NotNull String localizacao, @NotNull String nome, Evento evento, @NotNull int vagas,
			@NotNull String tipo_atividade, @NotNull Usuario responsavel, @NotNull List<Sessao> sessoes) {
		super();
		this.localizacao = localizacao;
		this.nome = nome;
		this.evento = evento;
		this.vagas = vagas;
		this.tipo_atividade = tipo_atividade;
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

	public String getTipo_atividade() {
		return tipo_atividade;
	}

	public void setTipo_atividade(String tipo_atividade) {
		this.tipo_atividade = tipo_atividade;
	}

	public boolean isAceita_inscricao() {
		return aceita_inscricao;
	}

	public void setAceita_inscricao(boolean aceita_inscricao) {
		this.aceita_inscricao = aceita_inscricao;
	}

	public boolean isCertificado_liberado() {
		return certificado_liberado;
	}

	public void setCertificado_liberado(boolean certificado_liberado) {
		this.certificado_liberado = certificado_liberado;
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

	public int getId() {
		return id;
	}

}
