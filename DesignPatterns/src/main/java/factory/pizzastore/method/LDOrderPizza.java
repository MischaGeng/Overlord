package factory.pizzastore.method;

import factory.pizzastore.pizza.CheesePizza;
import factory.pizzastore.pizza.GreekPizza;
import factory.pizzastore.pizza.LDCheesePizza;
import factory.pizzastore.pizza.LDPepperPizza;
import factory.pizzastore.pizza.PepperPizza;
import factory.pizzastore.pizza.Pizza;

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
