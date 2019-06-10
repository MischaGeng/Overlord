package com.overlord.designpatterns.adaptor.ClassAdaptor;

import com.overlord.designpatterns.adaptor.Common.*;

// 适配器类，作用：Adapted-->Target
public class Adapter extends Adapted implements Target {

    @Override
    public void request() {
        // 前置操作
        System.out.println("通过类适配器将Adapted适配为Target");

        // 调用Adapted类中的adaptedRequest方法
        super.adaptedRequest();

        // 后置操作
        System.out.println("通过类适配器适配完成");
    }
}
