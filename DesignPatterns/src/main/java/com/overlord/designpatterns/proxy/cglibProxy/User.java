package com.overlord.designpatterns.proxy.cglibProxy;

/**
 * 目标对象,没有实现任何接口
 */
public class User {

    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
