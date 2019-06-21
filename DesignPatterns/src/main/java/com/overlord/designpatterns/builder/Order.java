package com.overlord.designpatterns.builder;

import java.util.List;

/**
 * 产品角色  使用订单来模拟
 */
public class Order {
    private String name;
    private float price;
    private List<String> components;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public void show(){
        StringBuilder sb = new StringBuilder();
        for(String component : components){
            sb.append(component).append(",");
        }
        System.out.println("订单名称： "+ name +"; 订单价格： "+ price +"; 订单组成： " + sb.toString());
    }
}
