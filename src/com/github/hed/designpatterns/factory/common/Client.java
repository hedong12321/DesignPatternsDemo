package com.github.hed.designpatterns.factory.common;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-通用方式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        // 业务逻辑处理……
    }
}
