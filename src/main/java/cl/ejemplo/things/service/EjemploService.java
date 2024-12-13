package cl.ejemplo.things.service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EjemploService {
	
	private Integer number;
	
	public Integer getNumber(Integer number) {				
		this.number = number;
		number = 10;
		return this.number;
	}
}
