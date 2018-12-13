package br.ufc.pet.seven.evento;

import java.util.List;

public interface EventoService {

	public List<Evento> readEventos();

	public Evento readEventosbyName(String nome);

	public Evento createEvento(Evento evento);

	public Evento updateEvento(Evento evento);

	public void deleteEvento(Evento evento);

	public void publicarEvento(Evento evento);

	public Evento encerrarEvento(Evento evento);
}
