package com.github.hed.designpatterns.factory.singleton;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式实现单例-单例类
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    // 限制产生多个实例（私有构造方法）
    private Singleton(){}

    // 类中其他方法
    public static void doSomething(){}
}
