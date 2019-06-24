package com.overlord.designpatterns.builder;

import java.util.List;

/**
 * 抽象建造者
 */
public abstract class Builder {
    protected Order order = new Order();
    public abstract void setName(String name);
    public abstract void setPrice(float price);
    public abstract void setComponents(List<String> components);

    public Order getOrder(){
        return order;
    }
}
