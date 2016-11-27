package com.github.hed.designpatterns.factory.multifactory;

import com.github.hed.designpatterns.factory.common.ConcreteProduct1;
import com.github.hed.designpatterns.factory.common.Product;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-升级为多个工厂类-工厂实现类1
 */
public class ConcreteCreator1 extends Creator {
    @Override
    public  Product createProduct() {
        return new ConcreteProduct1();
    }
}
