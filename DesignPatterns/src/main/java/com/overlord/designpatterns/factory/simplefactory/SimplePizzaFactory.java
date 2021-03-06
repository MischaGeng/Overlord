package com.overlord.designpatterns.factory.simplefactory;

import com.overlord.designpatterns.factory.pizza.CheesePizza;
import com.overlord.designpatterns.factory.pizza.GreekPizza;
import com.overlord.designpatterns.factory.pizza.PepperPizza;
import com.overlord.designpatterns.factory.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String orderType) {
		Pizza pizza = null;

		if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (orderType.equals("greek")) {
			pizza = new GreekPizza();
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
