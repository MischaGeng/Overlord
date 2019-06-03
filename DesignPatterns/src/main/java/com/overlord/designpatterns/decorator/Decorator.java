package com.overlord.designpatterns.decorator;

/*
 * @Description: 装饰角色（Decorator）持有一个构件（Component）对象的引用，并定义一个与抽象构件接口一致的接口。
 *
 * @author MischaGeng
 * @Created Date: 2019/06/03
 * @Since JDK 1.8
 * @Title: Decorator
 * @ProjectName Overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void doSomething() {
        component.doSomething();
    }
}