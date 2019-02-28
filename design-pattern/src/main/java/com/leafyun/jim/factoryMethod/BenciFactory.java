package com.leafyun.jim.factoryMethod;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 奔驰工厂
 * @date: 2018-12-17
 * @time: 22:09
 */
public class BenciFactory implements CarFactory {

    @Override
    public  Car createCar() {
        return new Benci();
    }
}
