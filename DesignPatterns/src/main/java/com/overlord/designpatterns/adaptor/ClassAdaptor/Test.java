package com.overlord.designpatterns.adaptor.ClassAdaptor;

import com.overlord.designpatterns.adaptor.Common.*;

public class Test {
    public static void main(String[] args) {

        // 实例化Adapter对象
        Target adapterTarget = new Adapter();
        // 调用Adapter已适配的方法
        adapterTarget.request();
    }
}
