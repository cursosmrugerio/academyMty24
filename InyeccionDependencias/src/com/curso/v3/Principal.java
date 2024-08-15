package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Becario bec1 = new Becario("Patrobas");
		
		Inyector.inyectarComputadora(bec1,"Lin");
		
		bec1.elaborarPrograma();
		
		Becario bec2 = new Becario("Andronico");
		
		Inyector.inyectarComputadora(bec2,"Win");
		
		bec2.elaborarPrograma();
		
		Inyector.inyectarComputadora(bec2,"Lin");
		
		bec2.elaborarPrograma();
		
		Becario bec3 = new Becario("Epeneto");
		
		Inyector.inyectarComputadora(bec3,"Mac");
		
		bec3.elaborarPrograma();
		
	}

}
