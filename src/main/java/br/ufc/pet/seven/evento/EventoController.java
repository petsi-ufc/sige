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
	EventoService service;

	@GetMapping("/eventos")
	public List<Evento> readEventos() {
		return service.readEventos();
	}

	@GetMapping("/evento/{nome}")
	public Evento readEventoByNome(@PathVariable(value = "nome") String nome) {
		return service.readEventosbyName(nome);
	}

	@PostMapping("/evento")
	public Evento createEvento(@RequestBody Evento evento) {
		return service.createEvento(evento);
	}

	@DeleteMapping("/evento")
	public void deleteEvento(@RequestBody Evento evento) {
		service.deleteEvento(evento);
	}

	@PutMapping("/evento")
	public Evento updateEvento(@RequestBody Evento evento) {
		return service.updateEvento(evento);
	}

	@PostMapping("/evento")
	public void publicarEvento(@RequestBody Evento evento) {
		service.publicarEvento(evento);
	}
}
