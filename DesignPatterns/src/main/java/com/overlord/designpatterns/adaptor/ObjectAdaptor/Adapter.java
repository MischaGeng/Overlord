package com.overlord.designpatterns.adaptor.ObjectAdaptor;

import com.overlord.designpatterns.adaptor.Common.Adapted;
import com.overlord.designpatterns.adaptor.Common.Target;

// 适配器类，作用：Adapted-->Target
// 对象适配器与类适配器不同之处在于，类适配器通过继承来完成适配，对象适配器则是通过关联来完成
public class Adapter implements Target {

    // 适配者是对象适配器的一个属性对象
    private Adapted adapted = new Adapted();

    @Override
    public void request() {
        // 前置操作
        System.out.println("通过对象适配器将Adapted适配为Target");

        // 调用Adapted类中的adaptedRequest方法
        adapted.adaptedRequest();

        // 后置操作
        System.out.println("通过对象适配器适配完成");
    }
}
