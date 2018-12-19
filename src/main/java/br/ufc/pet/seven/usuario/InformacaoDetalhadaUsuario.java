package br.ufc.pet.seven.usuario;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class InformacaoDetalhadaUsuario {

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_criacao")
	private Date dataCriacao;
	
	private String telefone;
	private String instituicao;
	private String cidade;
	private String uf;

	public InformacaoDetalhadaUsuario() {
		
	}
	
	public InformacaoDetalhadaUsuario(Date dataNascimento, Date dataCriacao, String telefone,
			String instituicao, String cidade, String uf) {
		super();
		this.dataNascimento = dataNascimento;
		this.dataCriacao = dataCriacao;
		this.telefone = telefone;
		this.instituicao = instituicao;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
