package br.ufc.pet.seven.entity;

import org.springframework.security.core.Transient;

@Transient
public final class Papel {
	
	private static final String ADMINISTRADOR = "administrador";
	private static final String ORGANIZADOR = "organizador";
	private static final String AUXILIAR = "auxiliar";
	private static final String RESPONSAVEL_ATIVIDADE = "responsavel_atividade";
	private static final String PARTICIPANTE = "participante";
 
    private Papel() {
    	throw new AssertionError();
    }
}
