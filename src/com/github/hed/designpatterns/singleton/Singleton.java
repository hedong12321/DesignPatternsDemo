package com.github.hed.designpatterns.singleton;

/**
 * Created by dong.he on 2016/11/27.
 * 单例模式通用代码
 * 可对单例模式进行扩展，实现指定实例数量的单例模式
 * 大概原理，利用集合（静态成员）存放产生的实例，在Singleton类中以静态块的方式产生Singleton实例并放置到集合里，
 * 在获取实例时从集合中取出来就可以了
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    // 限制产生多个实例（私有构造方法）
    private Singleton(){}
    // 通过该方法获取实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    // 类中其他方法，尽量是static
    public static void doSomething(){}
}
