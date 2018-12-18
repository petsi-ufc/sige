package br.ufc.pet.seven.usuario;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "usuario")
public class Usuario {

	public static final String MASCULINO = "masculino";
	public static final String FEMININO = "feminino";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial", updatable = false, nullable = false)
	private long id;

	@NotNull
	private String nome;

	@NotNull
	private String senha;

	@NotNull
	private String email;

	@Temporal(TemporalType.DATE)
	@NotNull
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@NotNull
	private String sexo;

	private String telefone;
	private String instituicao;
	private String cidade;
	private String uf;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@NotNull
	@Column(name = "data_criacao")
	private Date dataCriacao;

	@OneToMany
	@NotNull
	@JoinColumn(name = "usuario_id")
	@Column(name = "papel")
	private List<Papel> papeis;

	@Column(name = "status_conta")
	private boolean statusConta = true;
	
	@Column(name = "ativacaoEmail")
	private boolean ativacaoEmail = false;

	public Usuario() {

	}

	public Usuario(@NotNull String nome, @NotNull String senha, String telefone, @NotNull String email,
			@NotNull Date dataNascimento, @NotNull String sexo, String instituicao, String cidade,
			String uf, @NotNull Date dataCriacao, @NotNull List<Papel> papeis) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.instituicao = instituicao;
		this.cidade = cidade;
		this.uf = uf;
		this.dataCriacao = dataCriacao;
		this.papeis = papeis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	public boolean isStatusConta() {
		return statusConta;
	}

	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}

	public boolean isAtivacaoEmail() {
		return ativacaoEmail;
	}

	public void setAtivacaoEmail(boolean ativacaoEmail) {
		this.ativacaoEmail = ativacaoEmail;
	}

	public long getId() {
		return id;
	}

	public static String getMasculino() {
		return MASCULINO;
	}

	public static String getFeminino() {
		return FEMININO;
	}

}
