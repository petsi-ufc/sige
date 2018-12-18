package br.ufc.pet.seven.atividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/atividade/")
@Api(value = "Módulo de Atividades")
@CrossOrigin(origins = "*")
public class AtividadeController {
	
	private AtividadeService service;
	
	@Autowired
	public AtividadeController(AtividadeService service){
		this.service = service;
	}

	/*As respostas do ResponseEntity<?> presisam de um retorno em json 
	recomendo utilizar o JACKSON*/
	
	/*Nenhuma request precisa ser especificadas com nome o proprio metodo 
	 http diz o que elas vão fazer*/
	
	/*Por enquanto que não foi feito o tratamento de erro a resposta vai ficar como 
	OK(Codigo http:200) pra fins de teste*/
	
	@GetMapping(value="/", produces = "application/json")
	@ApiOperation(value = "Retorna uma lista de Atividades")
	@ResponseBody
	public ResponseEntity<?> readAtividades() {
		return ResponseEntity.ok(service.readAtividades());
	}
	
	@ResponseBody
	@GetMapping(value="/{id}", produces = "application/json")
	@ApiOperation(value = "Retorna uma Atividade com base no id")
	public ResponseEntity<?> readAtividadeById(@PathVariable(value = "id") int id) {
		return ResponseEntity.ok(service.readAtividadeById(id));
	}
	
	@ResponseBody
	@PostMapping(value="/", produces = "application/json")
	@ApiOperation(value = "Cria uma nova Atividade")
	public ResponseEntity<?> createAtividade(@RequestBody Atividade atividade) {
		return ResponseEntity.ok(service.createAtividade(atividade));
	}
	
	@ResponseBody
	@DeleteMapping(value="/", produces = "application/json")
	@ApiOperation(value = "Deleta uma atividade existente")
	public ResponseEntity<?> deleteAtividade(@RequestBody Atividade atividade) {
		return ResponseEntity.ok(service.deleteAtividade(atividade));
	}
	
	@ResponseBody
	@PutMapping(value="/", produces = "application/json")
	@ApiOperation(value = "Atualiza uma atividade existentente")
	public ResponseEntity<?> updateAtividade(@RequestBody Atividade atividade) {
		return ResponseEntity.ok(service.updateAtividade(atividade));
	}

}
