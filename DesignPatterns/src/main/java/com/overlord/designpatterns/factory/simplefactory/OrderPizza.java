package com.overlord.designpatterns.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.overlord.designpatterns.factory.pizza.Pizza;

public class OrderPizza {
	SimplePizzaFactory mSimplePizzaFactory;

	public OrderPizza(SimplePizzaFactory mSimplePizzaFactory) {

		setFactory(mSimplePizzaFactory);
	}

	public void setFactory(SimplePizzaFactory mSimplePizzaFactory) {
		Pizza pizza = null;
		String orderType;

		this.mSimplePizzaFactory = mSimplePizzaFactory;

		do {
			orderType = getType();
			pizza = mSimplePizzaFactory.CreatePizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}

		} while (true);

	}

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();

			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
