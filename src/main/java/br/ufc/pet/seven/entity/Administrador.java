package br.ufc.pet.seven.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador extends Usuario {

	public Administrador() {
		
	}
}
