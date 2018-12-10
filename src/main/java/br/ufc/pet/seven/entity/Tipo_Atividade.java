package br.ufc.pet.seven.entity;

public enum Tipo_Atividade {

	PALESTRA("palestra"), 
	MINICURSO("minicurso"), 
	MESA_REDONDA("mesa_redonda"), 
	HACKATHON("hackathon"), 
	OFICINA("oficina"), 
	EXPOSICAO("exposicao"), 
	APRESENTACAO("apresentacao"), 
	WORKSHOP("workshop"), 
	OUTROS("outros");
	
	private String tipo_atividade;
	
	Tipo_Atividade(String tipo_atividade) {
        this.tipo_atividade = tipo_atividade;
    }
 
    public String getTipo_Atividade() {
        return tipo_atividade;
    }
}
