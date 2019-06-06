package com.overlord.designpatterns.factory.absfactory;

import com.overlord.designpatterns.factory.pizza.NYCheesePizza;
import com.overlord.designpatterns.factory.pizza.NYPepperPizza;
import com.overlord.designpatterns.factory.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
