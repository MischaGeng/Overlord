package factory.pizzastore.method;

import factory.pizzastore.pizza.CheesePizza;
import factory.pizzastore.pizza.GreekPizza;
import factory.pizzastore.pizza.NYCheesePizza;
import factory.pizzastore.pizza.NYPepperPizza;
import factory.pizzastore.pizza.PepperPizza;
import factory.pizzastore.pizza.Pizza;

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
