package br.ufc.pet.seven.entity;

import org.springframework.security.core.Transient;

@Transient
public final class Sexo {

	private static final String MASCULINO = "masculino";
	private static final String FEMININO = "feminino";
	private static final String OUTROS = "OUTROS";
	
	private Sexo() {
	    throw new AssertionError();
	}

}
