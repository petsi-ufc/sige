package br.ufc.pet.seven.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/usuarios")
@Api(value = "Módulo de Usuário")
@CrossOrigin(origins = "*")
public class UsuarioController {

	private UsuarioService service;
	
	@Autowired
	public UsuarioController(UsuarioService service){
		this.service = service;
	}

	@GetMapping("/listar")
	@ApiOperation(value = "Retorna uma lista de Usuários")
	public List<Usuario> readUsuarios() {
		return service.readUsuarios();
	}

	@GetMapping("/buscar/{id}")
	@ApiOperation(value = "Retorna um Usuário com base no id")
	public Usuario readUsuarioById(int id) {
		return service.readUsuarioById(id);
	}

	@PostMapping("/criar")
	@ApiOperation(value = "Cria um novo Usuário")
	public Usuario createUsuario(Usuario usuario) {
		return service.createUsuario(usuario);
	}

	@DeleteMapping("/deletar")
	@ApiOperation(value = "Deleta um Usuário existente")
	public void deleteUsuario(Usuario usuario) {
		service.deleteUsuario(usuario);
		;
	}

	@PutMapping("/atualizar")
	@ApiOperation(value = "Atualiza um Usuário existente")
	public Usuario updateUsuario(Usuario usuario) {
		return service.updateUsuario(usuario);
	}

}
