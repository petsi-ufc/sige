package br.ufc.pet.seven.entity;

import java.time.LocalDate;
import java.util.List;

public class Evento {

	private int id;
	private String nome;
	private String sigla;
	private String area;
	private String localizacao;
	private String descricao;
	private LocalDate incio_inscricao;
	private LocalDate fim_inscricao;
	private LocalDate inicio;
	private LocalDate fim;
	private boolean status = true;
	private Organizador organizador;
	private List<Atividade> atividade;
	private List<Auxiliar> auxiliar;

}
