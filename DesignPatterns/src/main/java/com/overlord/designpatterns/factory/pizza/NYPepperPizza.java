package com.overlord.designpatterns.factory.pizza;

/**
 * 纽约胡椒pizza
 */
public class NYPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("NYPepperPizza");
		
		System.out.println(name+" preparing;");
	}

}
