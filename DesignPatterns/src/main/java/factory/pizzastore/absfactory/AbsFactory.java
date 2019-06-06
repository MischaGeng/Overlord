package factory.pizzastore.absfactory;

import factory.pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;

}
