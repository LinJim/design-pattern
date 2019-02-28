package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.Singleton2;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2018-12-17
 * @time: 18:49
 */
public class Singleton2Test {
    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
