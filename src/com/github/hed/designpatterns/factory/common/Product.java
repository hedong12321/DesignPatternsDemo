package com.github.hed.designpatterns.factory.common;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-通用方式-产品抽象
 */
public abstract class Product {
    // 产品类的公共方法
    public  void method1(){
        // 业务逻辑处理
    }

    public abstract void method2();
}
