package com.overlord.designpatterns.builder;

import java.util.List;

/**
 * 具体建造者  订单1
 */
public class Order1Builder extends Builder {
    @Override
    public void setName(String name) {
        order.setName(name);
    }

    @Override
    public void setPrice(float price) {
        order.setPrice(price);
    }

    @Override
    public void setComponents(List<String> components) {
        order.setComponents(components);
    }
}
