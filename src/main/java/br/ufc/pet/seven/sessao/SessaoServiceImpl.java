package br.ufc.pet.seven.sessao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessaoServiceImpl implements SessaoService {

	@Autowired
	SessaoRepository repo;

	@Override
	public List<Sessao> readSessoes() {
		return repo.findAll();
	}

	@Override
	public Sessao readSessaoById(int id) {
		return repo.getById(id);
	}

	@Override
	public Sessao createSessao(Sessao sessao) {
		return repo.save(sessao);
	}

	@Override
	public void deleteSessao(Sessao sessao) {
		repo.delete(sessao);
	}

	@Override
	public Sessao updateSessao(Sessao sessao) {
		return repo.save(sessao);
	}

}
