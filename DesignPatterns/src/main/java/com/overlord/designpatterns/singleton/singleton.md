# JAVA设计模式之单例模式

**概念**

     单例模式（Singleton Pattern）是 Java中最简单的设计模式之一，这种类型的设计模式属于创建型模式。通过单例模式可以保证系统中该模式的一个类只有一个实例，即一个类只有一个对象实例。类本身负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

**应用场景**

    1.创建一个对象需要消耗的资源果多，如访问IO和数据库等资源。
    2.需要定义大量的静态常量和静态方法（如工具类）的环境。
    3.要求生成唯一序列号的环境
    4.资源共享的情况下，避免由于资源操作时导致的性能或损耗等。如日志文件，应用配置。
    5.控制资源的情况下，方便资源之间的互相通信。如线程池等。

**优点**

    1.由于单例模式在内存中只存在一个实例，减少内存的开支，特别是一个对象需要频繁地创建、销毁、而且创建或销毁的性能又无法优化时，单例模式的优势就非常明显。
    2.当对象创建时需要比较多资源时，如读取配置、产生其他依赖对象时，可以通过单实例永驻内存的返回时解决。
    3.单例模式可以避免对资源的多重占用，例如写文件动作，由于只有一个实例存在于内存中，避免了对同一资源文件的同时操作。
    4.单例模式可以在系统中设置全局的访问点，优化和共享资源的访问，例如设计一个单例类，负责所有数据表的映射处理。

**缺点**

    1.单实例无法创建子类，扩展困难，若要扩展，除了修改代码基本上没有第二种途径可以实现。
    2.单例类的职责过重，在一定程度上违背了“单一职责原则”。

**分类**

    根据Java语言的特点，使得Java中实现单实例模式通常有两种表现方式。
    1.饿汉式（Early）单例类：类加载时，就进行对象实例化
    2.懒汉式（Lazy）单例类：第一次引用类时，才进行对象实例化。