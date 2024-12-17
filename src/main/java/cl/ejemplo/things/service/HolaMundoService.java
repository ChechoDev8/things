package cl.ejemplo.things.service;

import cl.ejemplo.things.concreteclasses.HolaMundo;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HolaMundoService{
	
	private HolaMundo service;
	
	public HolaMundoService(HolaMundo service) {
		this.service = service;
	}

	public void execHolaMundo(String message) {
		this.service.printMessage(message);
	}
}
