package com.leafyun.jim.abstractFactory;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 汽车抽象工厂：用来生产不同产品族的全部产品
 * @date: 2018-12-21
 * @time: 13:22
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
