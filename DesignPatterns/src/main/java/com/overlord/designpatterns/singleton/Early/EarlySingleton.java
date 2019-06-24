package com.overlord.designpatterns.singleton.Early;

// 饿汉式单例类，在类加载时实例化对象
public class EarlySingleton {

    private static EarlySingleton instance = new EarlySingleton();

    // 构造函数私有，保证外界无法直接实例化
    private EarlySingleton()
    {
        System.out.println("EarlySingleton(): Initializing Instance");
    }

    // 通过该方法获得实例对象
    public static EarlySingleton getInstance()
    {
        return instance;
    }

    // 单例类的功能逻辑方法
    public void doSomething()
    {
        System.out.println("doSomething(): EarlySingleton does something!");
    }
}
