package com.overlord.designpatterns.factory.pizza;

/**
 * 纽约奶酪pizza
 */
public class NYCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("NYCheesePizza");
		
		System.out.println(name+" preparing;");
	}

}
