package com.github.hed.designpatterns.factory.lazyinit;

import com.github.hed.designpatterns.factory.common.ConcreteProduct1;
import com.github.hed.designpatterns.factory.common.ConcreteProduct2;
import com.github.hed.designpatterns.factory.common.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dong.he on 2016/11/27.
 * 延迟初始化，指一个对象消费完毕后不立即进行释放，工厂类保持其初始状态，等待被再次使用
 * 使用一个Map来缓存需要再次被使用的对象
 * 延迟加载框架是可以扩展的，如限制一个产品类的最大实例化数量（如jdbc连接池最大数量），同时，在对象初始化比较
 * 复杂的情况下，有利于降低对象实例化和销毁带来的复杂性和提升程序运行效率
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap();
    public static synchronized Product createProduct(String type) throws Exception{
        Product product = null;
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }

            prMap.put(type, product);
        }
        return product;
    }
}
