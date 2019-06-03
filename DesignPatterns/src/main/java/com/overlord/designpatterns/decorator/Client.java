package com.overlord.designpatterns.decorator;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2019/06/03
 * @Since JDK 1.8
 * @Title: Client
 * @ProjectName Overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Component componentOne = new ConcreteDecoratorOne(component);

        Component componentTwo = new ConcreteDecoratorTwo(componentOne);

        componentTwo.doSomething();
    }
}
