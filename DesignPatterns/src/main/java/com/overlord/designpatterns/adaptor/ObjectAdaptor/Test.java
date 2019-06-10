package com.overlord.designpatterns.adaptor.ObjectAdaptor;

import com.overlord.designpatterns.adaptor.ObjectAdaptor.Adapter;
import com.overlord.designpatterns.adaptor.Common.Target;

public class Test {
    public static void main(String[] args) {

        // 实例化Adapter对象
        Target adapterTarget = new Adapter();
        // 调用Adapter已适配的方法
        adapterTarget.request();
    }
}
