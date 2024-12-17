package cl.ejemplo.things.concreteclasses;

import cl.ejemplo.things.interfaces.IUsuario;
import cl.ejemplo.things.model.UsuarioEntity;

public class Usuario implements IUsuario {

	public String MessageUsuario(UsuarioEntity user) {
		String message = "Hola " + user.getNombre() + ", password: " + user.getPass() + " y correo: " + user.getMail();
		return message;
	}
}
