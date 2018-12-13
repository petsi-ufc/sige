package br.ufc.pet.seven.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	public Usuario getById(int id);
}
