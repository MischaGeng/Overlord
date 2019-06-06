package com.overlord.designpatterns.factory.method;

import com.overlord.designpatterns.factory.pizza.NYCheesePizza;
import com.overlord.designpatterns.factory.pizza.NYPepperPizza;
import com.overlord.designpatterns.factory.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
