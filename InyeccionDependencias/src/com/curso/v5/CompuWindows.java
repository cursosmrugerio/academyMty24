package com.curso.v5;

public class CompuWindows implements Computadora {

	//Encapsular
	private String version;

	public CompuWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender Compu Windows "+ version);
	}
	
	
}
