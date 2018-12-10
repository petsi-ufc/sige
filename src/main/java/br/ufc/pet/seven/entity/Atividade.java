package br.ufc.pet.seven.entity;

import java.util.List;

public class Atividade {

	private int id;
	private String localizacao;
	private String nome;
	private Evento evento;
	private int vagas;
	private boolean aceita_inscricao = true;
	private Tipo_Atividade tipo_atividade;
	private boolean certificado_liberado;
	private Responsavel_Atividade responsavel;
	private List<Inscricao> inscricao;
	private List<Sessao> horario;

}
