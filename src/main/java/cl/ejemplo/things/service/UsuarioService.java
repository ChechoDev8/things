package cl.ejemplo.things.service;

import cl.ejemplo.things.concreteclasses.Usuario;
import cl.ejemplo.things.model.UsuarioEntity;

public class UsuarioService {

private final Usuario user;
	
	public UsuarioService(Usuario user) {
		this.user = user;
	}
	
	public String execUsuario(UsuarioEntity userEntity) {
		return this.user.MessageUsuario(userEntity);
	}
}
