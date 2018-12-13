package br.ufc.pet.seven.sessao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.ufc.pet.seven.sessao.Sessao;
import br.ufc.pet.seven.sessao.SessaoRepository;

public class SessaoController {

	@Autowired
	SessaoRepository repo;

	@GetMapping("/sessaos")
	public List<Sessao> readSessaos() {
		return repo.findAll();
	}

	@GetMapping("/sessao/{id}")
	public Sessao readSessaoById(@PathVariable(value = "id") int id) {
		return repo.getById(id);
	}

	@PostMapping("/sessao")
	public Sessao createSessao(@RequestBody Sessao sessao) {
		return repo.save(sessao);
	}

	@DeleteMapping("/sessao")
	public void deleteSessao(@RequestBody Sessao sessao) {
		repo.delete(sessao);
	}

	@PutMapping("/sessao")
	public Sessao updateSessao(@RequestBody Sessao sessao) {
		return repo.save(sessao);
	}

}
