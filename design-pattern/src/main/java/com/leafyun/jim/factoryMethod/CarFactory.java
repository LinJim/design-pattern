package com.leafyun.jim.factoryMethod;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 工厂方法模式：创建一个工厂接口，其他的产品工厂都实现这个接口
 * @date: 2018-12-17
 * @time: 21:56
 */
public interface CarFactory {

    public abstract Car createCar();
}
