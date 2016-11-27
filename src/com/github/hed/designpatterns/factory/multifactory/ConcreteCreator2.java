package com.github.hed.designpatterns.factory.multifactory;

import com.github.hed.designpatterns.factory.common.ConcreteProduct2;
import com.github.hed.designpatterns.factory.common.Product;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-升级为多个工厂类-工厂实现类2
 */
public class ConcreteCreator2 extends Creator {
    @Override
    public  Product createProduct() {
        return new ConcreteProduct2();
    }
}
