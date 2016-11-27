package com.github.hed.designpatterns.factory.multifactory;

import com.github.hed.designpatterns.factory.common.Product;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-通用方式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Product product1 = (new ConcreteCreator1()).createProduct();
        Product product2 = (new ConcreteCreator2()).createProduct();
        // 业务逻辑处理……
    }
}
