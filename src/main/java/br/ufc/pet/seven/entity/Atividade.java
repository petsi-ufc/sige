package br.ufc.pet.seven.entity;

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

@Entity
@Table(name = "atividade")
public class Atividade {

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
	
	@ManyToOne
	@NotNull
	private TipoAtividade tipo_atividade;
	
	private boolean aceita_inscricao = true;
	private boolean certificado_liberado = false;
	
	@ManyToOne
	@NotNull
	private Usuario responsavel;
	
	@OneToMany
	@NotNull
	private List<Sessao> sessao;
	
	@OneToMany
	@NotNull
	private List<Usuario> participante;
	
	public Atividade() {
		
	}
	
	public Atividade(@NotNull String localizacao, @NotNull String nome, Evento evento, @NotNull int vagas,
			@NotNull TipoAtividade tipo_atividade, @NotNull Usuario responsavel, @NotNull List<Sessao> sessao) {
		super();
		this.localizacao = localizacao;
		this.nome = nome;
		this.evento = evento;
		this.vagas = vagas;
		this.tipo_atividade = tipo_atividade;
		this.responsavel = responsavel;
		this.sessao = sessao;
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

	public TipoAtividade getTipo_atividade() {
		return tipo_atividade;
	}

	public void setTipo_atividade(TipoAtividade tipo_atividade) {
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

	public List<Sessao> getSessao() {
		return sessao;
	}

	public void setSessao(List<Sessao> sessao) {
		this.sessao = sessao;
	}

	public List<Usuario> getParticipante() {
		return participante;
	}

	public void setParticipante(List<Usuario> participante) {
		this.participante = participante;
	}

	public int getId() {
		return id;
	}		
}
