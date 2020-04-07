package com.overlord.designpatterns.factory.absfactory;

import com.overlord.designpatterns.factory.pizza.Pizza;

/**
 * 抽象工厂模式
 */
public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;

}
