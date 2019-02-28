package com.leafyun.jim.factoryMethod;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 吉普工厂
 * @date: 2018-12-17
 * @time: 22:09
 */
public class JipuFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Jipu();
    }
}
