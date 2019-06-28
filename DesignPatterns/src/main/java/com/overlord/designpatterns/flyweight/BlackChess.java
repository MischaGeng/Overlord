package com.overlord.designpatterns.flyweight;

/**
 * 具体享元类
 */
public class BlackChess extends Chess {
    @Override
    public void operate(String position) {
        System.out.println("操作黑棋位置为：" + position);
    }

}
