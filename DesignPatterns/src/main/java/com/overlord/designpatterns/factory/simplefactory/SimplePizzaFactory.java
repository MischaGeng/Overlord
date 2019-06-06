package com.overlord.designpatterns.factory.simplefactory;

import com.overlord.designpatterns.factory.pizza.CheesePizza;
import com.overlord.designpatterns.factory.pizza.GreekPizza;
import com.overlord.designpatterns.factory.pizza.PepperPizza;
import com.overlord.designpatterns.factory.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
