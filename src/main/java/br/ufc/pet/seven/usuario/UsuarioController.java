package br.ufc.pet.seven.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UsuarioController {
	
	@Autowired
	UsuarioRepository repo;

	@GetMapping("/usuarios")
	public List<Usuario> readUsuarios() {
		return repo.findAll();
	}

	@GetMapping("/usuario/{id}")
	public Usuario readUsuarioById(@PathVariable(value = "id") int id) {
		return repo.getById(id);
	}

	@PostMapping("/usuario")
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return repo.save(usuario);
	}

	@DeleteMapping("/usuario")
	public void deleteUsuario(@RequestBody Usuario usuario) {
		repo.delete(usuario);
	}

	@PutMapping("/usuario")
	public Usuario updateUsuario(@RequestBody Usuario usuario) {
		return repo.save(usuario);
	}
	
}
