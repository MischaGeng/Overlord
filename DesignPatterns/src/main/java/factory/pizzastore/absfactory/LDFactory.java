package factory.pizzastore.absfactory;

import factory.pizzastore.pizza.LDCheesePizza;
import factory.pizzastore.pizza.LDPepperPizza;
import factory.pizzastore.pizza.Pizza;

import factory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
