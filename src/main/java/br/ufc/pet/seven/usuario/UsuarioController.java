package br.ufc.pet.seven.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class UsuarioController {

	@Autowired
	UsuarioService service;

	@GetMapping("/usuarios")
	public List<Usuario> readUsuarios() {
		return service.readUsuarios();
	}

	@GetMapping("/usuario/{id}")
	public Usuario readUsuarioById(int id) {
		return service.readUsuarioById(id);
	}

	@PostMapping("/usuario")
	public Usuario createUsuario(Usuario usuario) {
		return service.createUsuario(usuario);
	}

	@DeleteMapping("/usuario")
	public void deleteUsuario(Usuario usuario) {
		service.deleteUsuario(usuario);
		;
	}

	@PutMapping("/usuario")
	public Usuario updateUsuario(Usuario usuario) {
		return service.updateUsuario(usuario);
	}

}
