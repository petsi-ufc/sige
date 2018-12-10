package br.ufc.pet.seven.entity;

public enum Sexo {

	MASCULINO("masculino"), 
	FEMININO("feminino"),
	OUTROS("outros");
	
	private String sexo;
	 
    Sexo(String sexo) {
        this.sexo = sexo;
    }
 
    public String getSexo() {
        return sexo;
    }

}
