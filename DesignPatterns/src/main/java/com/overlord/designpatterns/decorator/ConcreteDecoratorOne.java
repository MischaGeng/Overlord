package com.overlord.designpatterns.decorator;

/*
 * @Description: 具体装饰角色（Concrete  Decorator）负责给构件对象" 贴上" 附加的责任。
 *
 * @author MischaGeng
 * @Created Date: 2019/06/03
 * @Since JDK 1.8
 * @Title: ConcreteDecorator1
 * @ProjectName Overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class ConcreteDecoratorOne extends Decorator {

    public ConcreteDecoratorOne(Component component) {
        super(component);
    }

    public void doSomething() {
        super.doSomething();
        this.doAnohterThing();
    }

    private void doAnohterThing() {
        System.out.println("装饰1： 功能B");
    }
}