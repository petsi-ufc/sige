package br.ufc.pet.seven.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class UsuarioController {
	
	@Autowired
	UsuarioRepository repo;

	@GetMapping("/usuarios")
	public List<Usuario> readUsuarios() {
		return repo.findAll();
	}

	@GetMapping("/usuario/{id}")
	public Usuario readUsuarioById(int id) {
		return repo.getById(id);
	}

	@PostMapping("/usuario")
	public Usuario createUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

	@DeleteMapping("/usuario")
	public void deleteUsuario(Usuario usuario) {
		repo.delete(usuario);
	}

	@PutMapping("/usuario")
	public Usuario updateUsuario(Usuario usuario) {
		return repo.save(usuario);
	}
	
}
