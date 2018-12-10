package br.ufc.pet.seven.entity;

import java.time.LocalDate;
import java.util.Date;

public class Usuario {

	private int id;
	private String nome;
	private String senha;
	private String telefone;
	private String email;
	private LocalDate data_nascimento;
	private Sexo sexo;
	private String instituicao = null;
	private String cidade;
	private String uf;
	private Date data_criacao;
	private boolean status = true;
	private Papel papel;
	private boolean ativacao = false;

}
