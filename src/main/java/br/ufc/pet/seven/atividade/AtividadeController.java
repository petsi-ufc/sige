package br.ufc.pet.seven.atividade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AtividadeController {

	@Autowired
	AtividadeRepository repo;

	@GetMapping("/atividades")
	public List<Atividade> readAtividades() {
		return repo.findAll();
	}

	@GetMapping("/atividade/{id}")
	public Atividade readAtividadeById(@PathVariable(value = "id") int id) {
		return repo.getById(id);
	}

	@PostMapping("/atividade")
	public Atividade createAtividade(@RequestBody Atividade atividade) {
		return repo.save(atividade);
	}

	@DeleteMapping("/atividade")
	public void deleteAtividade(@RequestBody Atividade atividade) {
		repo.delete(atividade);
	}

	@PutMapping("/atividade")
	public Atividade updateAtividade(@RequestBody Atividade atividade) {
		return repo.save(atividade);
	}

}
