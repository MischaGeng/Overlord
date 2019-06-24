package com.overlord.designpatterns.bridge;

/**
 * 手机抽象类
 */
public abstract class Brand {

    protected Software software;

     //设置手机软件

    public void setSoftware(Software software) {

        this.software =software;

    }

    public abstract void run();

}