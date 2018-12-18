package br.ufc.pet.seven.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository repo;

	@Override
	public List<Usuario> readUsuarios() {
		return repo.findAll();
	}

	@Override
	public Usuario readUsuarioById(int id) {
		return repo.getById(id);
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public void deleteUsuario(Usuario usuario) {
		repo.delete(usuario);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

}
