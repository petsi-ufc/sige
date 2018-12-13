package br.ufc.pet.seven.evento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventoServiceImpl implements EventoService {

	@Autowired
	EventoRepository repo;

	@Override
	public List<Evento> readEventos() {
		return repo.findAll();
	}

	@Override
	public Evento readEventosbyName(String nome) {
		return repo.getByNome(nome);
	}

	@Override
	public Evento createEvento(Evento evento) {
		return repo.save(evento);
	}

	@Override
	public Evento updateEvento(Evento evento) {
		return repo.save(evento);
	}

	@Override
	public void deleteEvento(Evento evento) {
		repo.delete(evento);
	}

	@Override
	public void publicarEvento(Evento evento) {
		evento.setStatus(true);
	}

	@Override
	public Evento encerrarEvento(Evento evento) {
		return null;
	}

}
