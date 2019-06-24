package com.overlord.designpatterns.bridge;

public abstract class Brand {

    protected Software software;

//设置手机软件

    public void setSoftware(Software software) {

        this.software =software;

    }

    public abstract void run();

}