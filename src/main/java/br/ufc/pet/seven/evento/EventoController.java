package br.ufc.pet.seven.evento;

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
@RequestMapping(value = "/evento")
@Api(value = "Módulo de Eventos")
@CrossOrigin(origins = "*")
public class EventoController {

	private EventoService service;
	
	@Autowired
	public EventoController(EventoService service){
		this.service = service;
	}

	@GetMapping("/listar")
	@ApiOperation(value = "Retorna uma lista de Eventos")
	public List<Evento> readEventos() {
		return service.readEventos();
	}

	@GetMapping("/buscar/{nome}")
	@ApiOperation(value = "Retorna uma Evento com base no nome")
	public Evento readEventoByNome(@PathVariable(value = "nome") String nome) {
		return service.readEventosbyName(nome);
	}

	@PostMapping("/criar")
	@ApiOperation(value = "Criar um novo Evento")
	public Evento createEvento(@RequestBody Evento evento) {
		return service.createEvento(evento);
	}

	@DeleteMapping("/deletar")
	@ApiOperation(value = "Deleta um Evento existente")
	public void deleteEvento(@RequestBody Evento evento) {
		service.deleteEvento(evento);
	}

	@PutMapping("/atualizar")
	@ApiOperation(value = "Atualiza um Evento existente")
	public Evento updateEvento(@RequestBody Evento evento) {
		return service.updateEvento(evento);
	}

	@PostMapping("/publicar")
	@ApiOperation(value = "Torna um Evento público")
	public void publicarEvento(@RequestBody Evento evento) {
		service.publicarEvento(evento);
	}
}
