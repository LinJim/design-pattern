package com.leafyun.jim.simpleFactory;


/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 吉普车
 * @date: 2018-12-17
 * @time: 21:55
 */
public class Jipu implements Car{
    @Override
    public void run() {
        System.out.println("吉普车跑");
    }
}
