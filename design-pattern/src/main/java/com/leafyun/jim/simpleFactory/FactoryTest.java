package com.leafyun.jim.simpleFactory;



/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 简单工厂模式测试
 * @date: 2018-12-17
 * @time: 21:59
 */
public class FactoryTest {
    public static void main(String[] args) {
        Car jipu = CarFactory.createCar("1");
        Car benci = CarFactory.createCar("2");

        jipu.run();
        benci.run();
    }
}