package br.ufc.pet.seven.atividade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/atividade")
@Api(value = "Módulo de Atividades")
@CrossOrigin(origins = "*")
public class AtividadeController {
	@Autowired
	private AtividadeService service;

	@GetMapping("/listar")
	@ApiOperation(value = "Retorna uma lista de Atividades")
	public List<Atividade> readAtividades() {
		return service.readAtividades();
	}

	@GetMapping("/buscar/{id}")
	@ApiOperation(value = "Retorna uma Atividade com base no id")
	public Atividade readAtividadeById(@PathVariable(value = "id") int id) {
		return service.readAtividadeById(id);
	}

	@PostMapping("/criar")
	@ApiOperation(value = "Cria uma nova Atividade")
	public Atividade createAtividade(@RequestBody Atividade atividade) {
		return service.createAtividade(atividade);
	}

	@DeleteMapping("/deletar")
	@ApiOperation(value = "Deleta uma atividade existente")
	public void deleteAtividade(@RequestBody Atividade atividade) {
		service.deleteAtividade(atividade);
	}

	@PutMapping("/atualizar")
	@ApiOperation(value = "Atualiza uma atividade existentente")
	public Atividade updateAtividade(@RequestBody Atividade atividade) {
		return service.updateAtividade(atividade);
	}

}
