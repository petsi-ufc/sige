package br.ufc.pet.seven.sessao;

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
@RequestMapping(value = "/sessao")
@Api(value = "Módulo de Sessão")
@CrossOrigin(origins = "*")
public class SessaoController {

	@Autowired
	private SessaoService service;

	@GetMapping("/listar")
	@ApiOperation(value = "Retorna uma lista de Sessões")
	public List<Sessao> readSessoes() {
		return service.readSessoes();
	}

	@GetMapping("/buscar/{id}")
	@ApiOperation(value = "Retorna uma Sessão com no id")
	public Sessao readSessaoById(@PathVariable(value = "id") int id) {
		return service.readSessaoById(id);
	}

	@PostMapping("/criar")
	@ApiOperation(value = "Cria uma nova Sessão")
	public Sessao createSessao(@RequestBody Sessao sessao) {
		return service.createSessao(sessao);
	}

	@DeleteMapping("/deletar")
	@ApiOperation(value = "Deleta uma Sessão existente")
	public void deleteSessao(@RequestBody Sessao sessao) {
		service.deleteSessao(sessao);
	}

	@PutMapping("/atualizar")
	@ApiOperation(value = "Atualiza uma Sessão existente")
	public Sessao updateSessao(@RequestBody Sessao sessao) {
		return service.updateSessao(sessao);
	}

}
