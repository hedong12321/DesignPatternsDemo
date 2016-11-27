package com.github.hed.designpatterns.factory.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by dong.he on 2016/11/27.
 * Singleton单例类构造方法私有，保证了单例类不被其他类通过new进行实例化
 * 然后单例工厂利用反射进行单例类实例化
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            // 获取无参构造方法
            Constructor constructor = cl.getDeclaredConstructor();
            // 设置无参构造方法为可访问
            constructor.setAccessible(true);
            // 产生一个实例
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e){
            // 异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
