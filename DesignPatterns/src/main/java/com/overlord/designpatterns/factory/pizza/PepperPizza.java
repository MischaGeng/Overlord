package com.overlord.designpatterns.factory.pizza;


/**
 * 胡椒pizza
 */
public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("PepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
