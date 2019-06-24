package com.overlord.designpatterns.bridge;

/**
 * N品牌手机
 */
public class NBrand extends Brand {

    @Override

    public void run() {

        System.out.println("N品牌");

        software.run();

    }

}