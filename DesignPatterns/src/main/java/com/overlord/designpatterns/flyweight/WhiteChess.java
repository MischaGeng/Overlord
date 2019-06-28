package com.overlord.designpatterns.flyweight;

/**
 * 具体享元类
 */
public class WhiteChess extends Chess {
    @Override
    public void operate(String position) {
        System.out.println("操作白棋位置为：" + position);
    }
}
