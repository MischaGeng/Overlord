package com.overlord.designpatterns.bridge;

public class MBrand extends Brand {

    @Override

    public void run() {

        System.out.println("M品牌");

        software.run();

    }

}