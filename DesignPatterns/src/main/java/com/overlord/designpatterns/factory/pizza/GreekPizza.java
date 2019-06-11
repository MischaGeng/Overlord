package com.overlord.designpatterns.factory.pizza;

/**
 * 希腊pizza
 */
public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("GreekPizza");
		
		System.out.println(name+" preparing;");
	}

}
