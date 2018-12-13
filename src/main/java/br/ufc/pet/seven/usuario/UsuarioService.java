package br.ufc.pet.seven.usuario;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
	
	public List<Usuario> readUsuarios();

	public Usuario readUsuarioById(int id);

	public Usuario createUsuario(Usuario usuario);

	public void deleteUsuario(Usuario usuario);

	public Usuario updateUsuario(Usuario usuario);
}
