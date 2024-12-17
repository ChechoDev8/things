package cl.ejemplo.things.concreteclasses;

import cl.ejemplo.things.interfaces.IHolaMundo;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HolaMundo implements IHolaMundo {
	
	/** URL ROADMAP
	 * https://retosdeprogramacion.com/roadmap/
	 *  **/
	IHolaMundo service;
	String CONSTANTE = "Mensaje Constante";
	
	public void setPrimitiveData() {
		int intVar = 1;
		long longVar = 1L;
		char charVar = 'P';
		boolean boolVar = true;
	}
	
	public void printMessage(String message) {
		log.info(CONSTANTE);
		log.info(message);
	}
}
