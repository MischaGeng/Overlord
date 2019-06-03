package com.overlord.designpatterns.decorator;

/*
 * @Description:
 *
 * @author MischaGeng
 * @Created Date: 2019/06/03
 * @Since JDK 1.8
 * @Title: ConcreteDecoratorTwo
 * @ProjectName Overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class ConcreteDecoratorTwo extends Decorator {
    public ConcreteDecoratorTwo(Component component) {
        super(component);
    }

    public void doSomething() {
        super.doSomething();
        this.doAnohterThing();
    }

    private void doAnohterThing() {
        System.out.println("装饰2： 功能C");
    }
}
