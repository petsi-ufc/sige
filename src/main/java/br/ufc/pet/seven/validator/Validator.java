package br.ufc.pet.seven.validator;

public class Validator {

	private static Validator validation;
	
	private Validator() {
		
	}
	
	public static Validator getInstance() {
		if (validation == null) {
			validation = new Validator();
		}
		return validation;
	}
	
	//Insira suas validações abaixo
	//Siga as Regras de Negócio do sistema
	//Lance as devidas exceções 
}
