package com.overlord.designpatterns.proxy.cglibProxy;

public class Test {
    public static void main(String[] args) {
        //目标对象
        User target = new User();

        //代理对象
        User proxy = (User)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
