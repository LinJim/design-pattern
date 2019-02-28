package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.Singleton1;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 饿汉式单例测试
 * @date: 2018-12-17
 * @time: 18:34
 */
public class Singleton1Test {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }


}
