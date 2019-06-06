package com.overlord.designpatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.overlord.designpatterns.factory.pizza.CheesePizza;
import com.overlord.designpatterns.factory.pizza.ChinesePizza;
import com.overlord.designpatterns.factory.pizza.GreekPizza;
import com.overlord.designpatterns.factory.pizza.PepperPizza;
import com.overlord.designpatterns.factory.pizza.Pizza;

/**
 * 无工厂模式模式
 */
public class OrderPizza {

	public OrderPizza() {
		Pizza pizza = null;
		String ordertype;

		do {
			ordertype = gettype();

			if (ordertype.equals("cheese")) {
				pizza = new CheesePizza();
			} else if (ordertype.equals("greek")) {
				pizza = new GreekPizza();
			} else if (ordertype.equals("pepper")) {
				pizza = new PepperPizza();
			} else if (ordertype.equals("chinese")) {
				pizza = new ChinesePizza();
			} else {
				break;
			}
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	private String gettype() {
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
