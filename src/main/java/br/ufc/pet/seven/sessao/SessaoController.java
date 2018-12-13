package br.ufc.pet.seven.sessao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class SessaoController {

	@Autowired
	SessaoService service;

	@GetMapping("/sessaos")
	public List<Sessao> readSessoes() {
		return service.readSessoes();
	}

	@GetMapping("/sessao/{id}")
	public Sessao readSessaoById(@PathVariable(value = "id") int id) {
		return service.readSessaoById(id);
	}

	@PostMapping("/sessao")
	public Sessao createSessao(@RequestBody Sessao sessao) {
		return service.createSessao(sessao);
	}

	@DeleteMapping("/sessao")
	public void deleteSessao(@RequestBody Sessao sessao) {
		service.deleteSessao(sessao);
	}

	@PutMapping("/sessao")
	public Sessao updateSessao(@RequestBody Sessao sessao) {
		return service.updateSessao(sessao);
	}

}
