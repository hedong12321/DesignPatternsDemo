package com.github.hed.designpatterns.singleton;

/**
 * Created by dong.he on 2016/11/27.
 * 线程不安全的单例模式
 */
public class SingletonThreadInsecurity {
    private static SingletonThreadInsecurity singleton = null;
    // 限制产生多个实例（私有构造方法）
    private SingletonThreadInsecurity(){}
    // 通过该方法获取实例对象
    public static SingletonThreadInsecurity getSingleton() {
        if (singleton == null) { // 多个线程同时运行到这里时，判断结果都是true，此时将产生多个实例
            singleton = new SingletonThreadInsecurity();
        }
        return singleton;
    }

    // 类中其他方法，尽量是static
    public static void doSomething(){}
}
