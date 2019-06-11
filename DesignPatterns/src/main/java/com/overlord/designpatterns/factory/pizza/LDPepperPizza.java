package com.overlord.designpatterns.factory.pizza;

/**
 * 伦敦口味胡椒pizza
 */
public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("LDPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
