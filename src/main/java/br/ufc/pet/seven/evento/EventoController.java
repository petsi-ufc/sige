package br.ufc.pet.seven.evento;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EventoController {

	@GetMapping("/eventos")
	public List<Evento> readEventos() {
		return null;
	}

	@GetMapping("/evento/{nome}")
	public Evento readEventoByNome(@PathVariable(value = "nome") String nome) {
		return null;
	}

	@PostMapping("/evento")
	public Evento createEvento(@RequestBody Evento evento) {
		return null;
	}

	@DeleteMapping("/evento")
	public void deleteEvento(@RequestBody Evento evento) {
		
	}

	@PutMapping("/evento")
	public Evento updateEvento(@RequestBody Evento evento) {
		return null;
	}
	
	@PostMapping("/evento")
	public void publicarEvento(@RequestBody Evento evento) {
		
	}
}
