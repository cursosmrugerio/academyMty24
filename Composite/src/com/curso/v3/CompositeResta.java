package com.curso.v3;

//                         IS-A
public class CompositeResta implements Component {

	//HAS-A
	private Component compLeft;
	private Component compRight;
	
	public CompositeResta(Component compLeft, Component compRight) {
		this.compLeft = compLeft;
		this.compRight = compRight;
	}

	@Override
	public double getValue() {
		return compLeft.getValue() - compRight.getValue();
	}

}
