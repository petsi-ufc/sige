package br.ufc.pet.seven.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	private static final String MASCULINO = "masculino";
	private static final String FEMININO = "feminino";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String senha;
	
	@NotNull
	private String telefone;
	
	@NotNull
	private String email;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date data_nascimento;
	
	@NotNull
	private String sexo;
	
	private String instituicao = null;

	@NotNull
	private String cidade;
	
	@NotNull
	private String uf;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@NotNull
	private Date data_criacao;
	
	@OneToMany
	@NotNull
	@Column(name = "papel")
	private List<Papel> papeis;
	
	private boolean status_conta = true;
	private boolean ativacao_email = false;
	
	public Usuario(){
		
	}

	public Usuario(@NotNull String nome, @NotNull String senha, @NotNull String telefone, @NotNull String email,
			@NotNull Date data_nascimento, @NotNull String sexo, String instituicao, @NotNull String cidade,
			@NotNull String uf, @NotNull Date data_criacao, @NotNull List<Papel> papeis) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.telefone = telefone;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.sexo = sexo;
		this.instituicao = instituicao;
		this.cidade = cidade;
		this.uf = uf;
		this.data_criacao = data_criacao;
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

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
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

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	public boolean isStatus_conta() {
		return status_conta;
	}

	public void setStatus_conta(boolean status_conta) {
		this.status_conta = status_conta;
	}

	public boolean isAtivacao_email() {
		return ativacao_email;
	}

	public void setAtivacao_email(boolean ativacao_email) {
		this.ativacao_email = ativacao_email;
	}

	public int getId() {
		return id;
	}

	public static String getMasculino() {
		return MASCULINO;
	}

	public static String getFeminino() {
		return FEMININO;
	}
	
}
