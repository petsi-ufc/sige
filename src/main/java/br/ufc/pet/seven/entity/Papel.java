package br.ufc.pet.seven.entity;

public enum Papel {

	ADMINISTRADOR("administrador"),
	ORGANIZADOR("organizador"),
	AUXILIAR("auxiliar"),
	RESPONSAVEL_ATIVIDADE("responsavel_atividade"),
	PARTICIPANTE("participante");

	private String papel;
	 
    Papel(String papel) {
        this.papel = papel;
    }
 
    public String getPapel() {
        return papel;
    }
}
