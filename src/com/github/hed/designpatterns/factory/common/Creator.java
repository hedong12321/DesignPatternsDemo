package com.github.hed.designpatterns.factory.common;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-通用方式-抽象工厂类
 */
public abstract class Creator {
    /**
     * 创建产品的抽象方法
     * @param c Product抽象类的实现类类对象
     * @param <T> Product抽象类的实现类实例
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
