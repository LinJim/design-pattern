package com.leafyun.jim.simpleFactory;


/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 简单工厂模式（也叫静态工厂，因为他的创建方法一般是静态方法）
 * @date: 2018-12-17
 * @time: 21:56
 */
public class CarFactory {

    public static Car createCar(String type) {
        if (type.equals("1")) {
            return new Jipu();
        } else if (type.equals("2")) {
            return new Benci();
        } else {
            return null;
        }
    }

}
