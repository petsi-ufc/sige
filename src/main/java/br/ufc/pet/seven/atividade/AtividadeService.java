package br.ufc.pet.seven.atividade;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AtividadeService {
	
	public List<Atividade> readAtividades();

	public Atividade readAtividadeById(int id);

	public Atividade createAtividade(Atividade atividade);

	public void deleteAtividade(Atividade atividade);

	public Atividade updateAtividade(Atividade atividade);
}
