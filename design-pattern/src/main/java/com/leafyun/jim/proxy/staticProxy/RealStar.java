package com.leafyun.jim.proxy.staticProxy;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 真实角色
 * @date: 2019-02-13
 * @time: 12:26
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney");
    }
}
