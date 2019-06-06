package com.overlord.designpatterns.strategy;

/**
 * 测试策略模式
 */
public class TestStrategy {
    public static void main(String[] args) {
        Environment environment;
        int a = 1;
        int b = 2;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        environment = new Environment(new PlusStrategy());
        System.out.println("new Environment(new PlusStrategy()).calculate(a, b)=" + environment.calculate(a, b));

        environment = new Environment(new MinusStrategy());
        System.out.println("new Environment(new MinusStrategy()).calculate(a, b)=" + environment.calculate(a, b));
    }
}
