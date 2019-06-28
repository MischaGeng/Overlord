package com.overlord.designpatterns.flyweight;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Chess w1 = ChessFactory.getChess("white");
        Chess w2 = ChessFactory.getChess("white");
        Chess b1 = ChessFactory.getChess("black");
        Chess b2 = ChessFactory.getChess("black");

        System.out.println(w1 == w2);
        System.out.println(b1 == b2);

        w1.operate("50,50");
        b1.operate("50,40");

        w2.operate("60,50");
        b2.operate("60,40");
    }
}
