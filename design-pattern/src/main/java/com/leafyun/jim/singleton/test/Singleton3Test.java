package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.Singleton3;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2018-12-17
 * @time: 18:49
 */
public class Singleton3Test {
    public static void main(String[] args) {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}
