package com.overlord.designpatterns.builder;

import java.util.List;

/**
 * 指挥者
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Order construct(String name, float price, List<String> components){
        builder.setName(name);
        builder.setPrice(price);
        builder.setComponents(components);
        return builder.getOrder();
    }
}
