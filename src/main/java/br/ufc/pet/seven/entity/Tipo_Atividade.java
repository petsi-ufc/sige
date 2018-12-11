package br.ufc.pet.seven.entity;

import org.springframework.security.core.Transient;

@Transient
public final class Tipo_Atividade {

	private static final String PALESTRA = "palestra";
	private static final String MINICURSO = "minicurso";
	private static final String MESA_REDONDA = "mesa_redonda";
	private static final String HACKATHON = "hackathon";
	private static final String OFICINA = "oficina";
	private static final String EXPOSICAO = "exposicao";
	private static final String APRESENTACAO = "apresentacao";
	private static final String WORKSHOP = "workshop";
	private static final String OUTROS = "outros";
    
    private Tipo_Atividade() {
    	throw new AssertionError();
    }
}

