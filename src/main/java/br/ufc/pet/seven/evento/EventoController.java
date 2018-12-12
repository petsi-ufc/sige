package br.ufc.pet.seven.evento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EventoController {
	
	@Autowired
	EventoRepository repo;

	@GetMapping("/eventos")
	public List<Evento> readEventos() {
		return repo.findAll();
	}

	@GetMapping("/evento/{nome}")
	public Evento readEventoByNome(@PathVariable(value = "nome") String nome) {
		return repo.getByNome(nome);
	}

	@PostMapping("/evento")
	public Evento createEvento(@RequestBody Evento evento) {
		return repo.save(evento);
	}

	@DeleteMapping("/evento")
	public void deleteEvento(@RequestBody Evento evento) {
		// TODO:
		// Deletar somente se não houver participantes
		repo.delete(evento);
	}

	@PutMapping("/evento")
	public Evento updateEvento(@RequestBody Evento evento) {
		return repo.save(evento);
	}
	
	@PostMapping("/evento")
	public void publicarEvento(@RequestBody Evento evento) {
		evento.setStatus(true);
	}
}
