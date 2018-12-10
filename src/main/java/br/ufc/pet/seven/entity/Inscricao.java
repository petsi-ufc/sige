package br.ufc.pet.seven.entity;

import java.util.Date;
import java.util.List;

public class Inscricao {

	private int id;
	private Date data_criacao;
	private boolean status_credenciamento = false;
	private Participante participante;
	private List<Presenca> presenca;
	private Atividade atividade;

}
