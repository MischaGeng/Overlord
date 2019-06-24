package com.overlord.designpatterns.bridge;

public class NBrand extends Brand {

    @Override

    public void run() {

        System.out.println("N品牌");

        software.run();

    }

}