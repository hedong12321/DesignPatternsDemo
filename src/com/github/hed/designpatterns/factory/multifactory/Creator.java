package com.github.hed.designpatterns.factory.multifactory;

import com.github.hed.designpatterns.factory.common.Product;

/**
 * Created by dong.he on 2016/11/27.
 * 工厂方法模式-升级为多个工厂类-抽象工厂类
 * 在实际项目中，经常会遇到初始化一个对象很耗费精力的情况，所有的产品类放到一个工厂方法中进行初始化（实例化并赋初始值）
 * 会使代码结构不清晰，因此，为每个产品类实现一个创造者，然后由调用则选择与哪个工厂方法关联。
 */
public abstract class Creator {
    /**
     * 创建产品的抽象方法
     * @return
     */
    public abstract Product createProduct();
}
