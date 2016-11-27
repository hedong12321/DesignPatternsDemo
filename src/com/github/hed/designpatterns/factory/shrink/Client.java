package com.github.hed.designpatterns.factory.shrink;

import com.github.hed.designpatterns.factory.common.ConcreteProduct1;
import com.github.hed.designpatterns.factory.common.Product;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-缩小为简单工厂模式-场景类
 */
public class Client {
    public static void main(String[] args) {
        Product product = Creator.createProduct(ConcreteProduct1.class);
        // 业务逻辑处理……
    }
}
