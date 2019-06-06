package com.overlord.designpatterns.factory.method;

import com.overlord.designpatterns.factory.pizza.LDCheesePizza;
import com.overlord.designpatterns.factory.pizza.LDPepperPizza;
import com.overlord.designpatterns.factory.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {



	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
