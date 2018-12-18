package br.ufc.pet.seven.sessao;

import java.util.List;

public interface SessaoService {
	
	public List<Sessao> readSessoes();
	
	public Sessao readSessaoById(int id);
	
	public Sessao createSessao(Sessao sessao);
	
	public void deleteSessao(Sessao sessao);
	
	public Sessao updateSessao(Sessao sessao);
	
}
