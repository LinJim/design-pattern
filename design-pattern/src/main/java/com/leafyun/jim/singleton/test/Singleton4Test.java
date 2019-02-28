package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.Singleton4;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2018-12-17
 * @time: 18:49
 */
public class Singleton4Test {
    public static void main(String[] args) {
        Singleton4 singleton1 = Singleton4.getInstance();
        Singleton4 singleton2 = Singleton4.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
