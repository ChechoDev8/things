package cl.ejemplo.things;

import cl.ejemplo.things.concreteclasses.HolaMundo;
import cl.ejemplo.things.concreteclasses.Usuario;
import cl.ejemplo.things.concreteclasses.Number;
import cl.ejemplo.things.model.UsuarioEntity;
import cl.ejemplo.things.service.HolaMundoService;
import cl.ejemplo.things.service.NumberService;
import cl.ejemplo.things.service.UsuarioService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainThings {
	
	public static void main(String[] args) {
		Integer op = 4;
		switch(op) {
			case 1:
				ServiceEjemplo();
			break;
			case 2:
				ServiceUsuario();
			break;
			case 3:
				ServiceHolaMundo();
			break;
			case 4:
				ServiceNumber();
			break;
		}       
    }
	
	private static void ServiceEjemplo() {
		NumberService ejemploService = new NumberService(new Number());
        Integer number = ejemploService.execGetNumber(2);
        log.info(number);
	}
	
	private static void ServiceUsuario() {
		UsuarioEntity usuario = new UsuarioEntity("Sergio Silva", "password123", "prueba@prueba.cl");
        log.info(usuario.toString());
        
        UsuarioService usuarioService = new UsuarioService(new Usuario());
        log.info(usuarioService.execUsuario(usuario));
	}
	
	private static void ServiceHolaMundo() {
		HolaMundoService holaMundoService = new HolaMundoService(new HolaMundo());
		holaMundoService.execHolaMundo("¡Hola, JAVA!");
		
	}
	
	private static void ServiceNumber() {
		NumberService ejemploService = new NumberService(new Number());
		for(int i=10; i <= 55; i++) {
			ejemploService.execPrintNumber(i, 1);
			
			if(i % 2 == 0) {
				ejemploService.execPrintNumber(i,2);
			}
			
			if((i != 16) && (i % 3 != 0)) {
				ejemploService.execPrintNumber(i,3);
			}
		} 
        
	}
	
}
