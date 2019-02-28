package com.leafyun.jim.abstractFactory;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 高级车工厂实现汽车工厂接口：抽象工厂模式，用来生产不同产品族的全部产品
 * @date: 2018-12-21
 * @time: 13:24
 */
public class LuxuryCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return null;
    }

    @Override
    public Tyre createTyre() {
        return null;
    }
}
