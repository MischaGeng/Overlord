package com.overlord.designpatterns.decorator;

/*
 * @Description: 具体构件角色（Concrete Component）定义一个将要接收附加责任的类。
 *
 * @author MischaGeng
 * @Created Date: 2019/06/03
 * @Since JDK 1.8
 * @Title: ConcreteComponent
 * @ProjectName Overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class ConcreteComponent implements Component {

    public void doSomething() {
        System.out.println("具体构建：功能A");
    }
}