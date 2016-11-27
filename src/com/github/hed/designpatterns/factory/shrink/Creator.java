package com.github.hed.designpatterns.factory.shrink;

import com.github.hed.designpatterns.factory.common.Product;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-缩小为简单工厂模式-工厂实现类
 * 省略工厂抽象类，工厂实现类的产品生成方法直接静态化
 */
public class Creator  {
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T)product;
    }
}
