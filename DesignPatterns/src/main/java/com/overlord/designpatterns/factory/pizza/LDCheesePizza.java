package com.overlord.designpatterns.factory.pizza;

/**
 * 伦敦口味奶酪pizza
 */
public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
