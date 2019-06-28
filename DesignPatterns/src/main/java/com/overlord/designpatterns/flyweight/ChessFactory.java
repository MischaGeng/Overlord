package com.overlord.designpatterns.flyweight;

import java.util.HashMap;

/**
 * 享元工厂类
 */
public class ChessFactory {
    private static HashMap<String, Chess> pool = new HashMap<>();

    public static Chess getChess(String color) {
        Chess chess = null;
        if (pool.containsKey(color)) {    //池中有该对象
            chess = pool.get(color);
        } else {
            if (color.equals("white")) {
                chess = new WhiteChess();
            }
            if (color.equals("black")) {
                chess = new BlackChess();
            }
            //放入池中
            pool.put(color, chess);
        }
        return chess;
    }

}
