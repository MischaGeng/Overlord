package factory.pizzastore.simplefactory;

import factory.pizzastore.pizza.CheesePizza;
import factory.pizzastore.pizza.GreekPizza;
import factory.pizzastore.pizza.PepperPizza;
import factory.pizzastore.pizza.Pizza;

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
