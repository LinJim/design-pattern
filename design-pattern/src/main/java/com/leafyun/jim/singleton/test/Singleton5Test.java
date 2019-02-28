package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.Singleton5;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2018-12-17
 * @time: 18:49
 */
public class Singleton5Test {
    public static void main(String[] args) {
        Singleton5 singleton1 = Singleton5.SINGLETON_5;
        Singleton5 singleton2 = Singleton5.SINGLETON_5;
        System.out.println(singleton1 == singleton2);
        for(Singleton5 temp : Singleton5.values()){
            System.out.println(temp);
        }

    }

}
