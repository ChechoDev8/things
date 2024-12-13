package cl.ejemplo.things.service;

import cl.ejemplo.things.model.Usuario;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UsuarioService {

	public String MessageUsuario(Usuario user) {
		String message = "Hola " + user.getNombre() + ", password: " + user.getPass() + " y correo: " + user.getMail();
		return message;
	}
}
