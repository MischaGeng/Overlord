package com.overlord.designpatterns.factory.pizza;

/**
 * 中式pizza
 */
public class ChinesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("ChinesePizza");
		
		System.out.println(name+" preparing;");
	}

}
