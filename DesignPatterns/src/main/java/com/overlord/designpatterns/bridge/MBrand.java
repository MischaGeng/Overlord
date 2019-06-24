package com.overlord.designpatterns.bridge;

/**
 * M品牌手机
 */
public class MBrand extends Brand {

    @Override

    public void run() {

        System.out.println("M品牌");

        software.run();

    }

}