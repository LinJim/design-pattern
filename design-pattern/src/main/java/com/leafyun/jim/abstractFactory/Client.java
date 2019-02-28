package com.leafyun.jim.abstractFactory;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 客户端
 * @date: 2018-12-21
 * @time: 13:13
 */
public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine engine = carFactory.createEngine();
        engine.run();
        engine.start();
    }
}
