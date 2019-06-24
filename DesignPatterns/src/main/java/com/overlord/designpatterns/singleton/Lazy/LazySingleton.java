package com.overlord.designpatterns.singleton.Lazy;

// 懒汉式单例类，第一次引用类时实例化对象
public class LazySingleton {

    private static LazySingleton instance;

    // 构造函数私有，保证外界无法直接实例化
    private LazySingleton()
    {
        System.out.println("LazySingleton(): Initializing Instance");
    }


    public static LazySingleton getInstance()
    {
        if (instance == null)
        {
            // 方法同步，保证多线程安全
            synchronized(LazySingleton.class)
            {
                if (instance == null)
                {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }

    // 单例类的功能逻辑方法
    public void doSomething()
    {
        System.out.println("doSomething(): LazySingleton does something!");
    }
}
