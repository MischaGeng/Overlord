package com.overlord.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderPatternMain {
    public static void main(String[] args) {
        Builder order1Builder = new Order1Builder();
        Director director = new Director(order1Builder);
        List<String> list = new ArrayList<>();
        list.add("可乐");
        list.add("薯条");
        list.add("炸鸡");
        Order order = director.construct("炸鸡套餐", 19.8f, list);
        order.show();
    }
}
