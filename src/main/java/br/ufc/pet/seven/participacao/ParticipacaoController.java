package br.ufc.pet.seven.participacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipacaoController {
	
	@Autowired
	private ParticipacaoService service;

}
