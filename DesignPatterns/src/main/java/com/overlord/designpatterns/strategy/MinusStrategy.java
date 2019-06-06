package com.overlord.designpatterns.strategy;

/**
 * 具体策略角色
 */
public class MinusStrategy implements Strategy {
    @Override
    public int calc(int a, int b) {
        return a - b;
    }
}
