package br.ufc.pet.seven.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "papel")
public class Papel {

	public static final String ADMINISTRADOR = "administrador";
	public static final String ORGANIZADOR = "organizador";
	public static final String AUXILIAR = "auxiliar";
	public static final String RESPONSAVEL_ATIVIDADE = "responsavel_atividade";
	public static final String PARTICIPANTE = "participante";

	@Id
	@Column(updatable = false, nullable = false)
	@NotNull
	private String papel;

	@ManyToOne
	@NotNull
	private Usuario usuario;

	public Papel() {

	}

	public Papel(@NotNull String papel, @NotNull Usuario usuario) {
		super();
		this.papel = papel;
		this.usuario = usuario;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public static String getAdministrador() {
		return ADMINISTRADOR;
	}

	public static String getOrganizador() {
		return ORGANIZADOR;
	}

	public static String getAuxiliar() {
		return AUXILIAR;
	}

	public static String getResponsavelAtividade() {
		return RESPONSAVEL_ATIVIDADE;
	}

	public static String getParticipante() {
		return PARTICIPANTE;
	}

}
