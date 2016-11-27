package com.github.hed.designpatterns.factory.common;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-通用方式-工厂实现类
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T)product;
    }
}
