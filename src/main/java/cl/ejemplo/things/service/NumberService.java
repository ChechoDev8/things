package cl.ejemplo.things.service;

import cl.ejemplo.things.concreteclasses.Number;

public class NumberService {
	private final Number number;
	
	public NumberService(Number number) {
		this.number = number;
	}
	
	public Integer execGetNumber(Integer number) {
		return this.number.getNumber(number);
	}
	
	public void execPrintNumber(Integer number, Integer tipo) {
		this.number.printNumber(number, tipo);
	}
}
