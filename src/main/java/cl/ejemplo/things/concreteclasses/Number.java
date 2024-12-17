package cl.ejemplo.things.concreteclasses;

import cl.ejemplo.things.interfaces.INumber;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Number implements INumber {
	
private Integer number;
	
	public Integer getNumber(Integer number) {				
		this.number = number;
		number = 10;
		return this.number;
	}
	
	public void printNumber(Integer number, Integer tipo) {
		switch(tipo) {
			case 1:
				log.info("Numero: " + number.toString());
			break;
			case 2:
				log.info("Numero Par: " + number.toString());
			break;
			case 3:
				log.info("Numero "  + number.toString() + " no es 16 y tampoco es Multiplo de 3");
			break;
		}
	}
}
