package br.ufc.pet.seven.usuario;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
	
	@NotNull
	private String sexo;

	@OneToMany
	@NotNull
	@JoinColumn(name = "usuario_id")
	@Column(name = "papel")
	private List<Papel> papeis;

	@Column(name = "status_conta", nullable = false, columnDefinition = "boolean default true")
	private boolean statusConta = true;
	
	@Column(name = "ativacao_email", nullable = false, columnDefinition = "boolean default false")
	private boolean ativacaoEmail = false;
	
	private InformacaoDetalhadaUsuario informacaoDetalhadaUsuario;

	public Usuario() {

	}

	public Usuario(@NotNull String nome, @NotNull String senha, @NotNull String email, @NotNull String sexo,
			@NotNull List<Papel> papeis, InformacaoDetalhadaUsuario informacaoDetalhadaUsuario) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.sexo = sexo;
		this.papeis = papeis;
		this.informacaoDetalhadaUsuario = informacaoDetalhadaUsuario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public InformacaoDetalhadaUsuario getInformacaoDetalhadaUsuario() {
		return informacaoDetalhadaUsuario;
	}

	public void setInformacaoDetalhadaUsuario(InformacaoDetalhadaUsuario informacaoDetalhadaUsuario) {
		this.informacaoDetalhadaUsuario = informacaoDetalhadaUsuario;
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
