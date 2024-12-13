package cl.ejemplo.things;

import cl.ejemplo.things.model.Usuario;
import cl.ejemplo.things.service.EjemploService;
import cl.ejemplo.things.service.UsuarioService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainThings {
	
	public static void main(String[] args) {
        System.out.println("¡Hola desde Maven!");
        EjemploService ejemploService = new EjemploService();
        Integer number = ejemploService.getNumber(2);
        log.info(number);
        
        Usuario usuario = new Usuario("Sergio Silva", "password123", "prueba@prueba.cl");
        log.info(usuario.toString());
        
        UsuarioService usuarioService = new UsuarioService();
        log.info(usuarioService.MessageUsuario(usuario));
    }	
	
}
