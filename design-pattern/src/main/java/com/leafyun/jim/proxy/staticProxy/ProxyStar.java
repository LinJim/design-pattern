package com.leafyun.jim.proxy.staticProxy;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 静态定义代理类
 * @date: 2019-02-13
 * @time: 12:28
 */
public class ProxyStar implements Star {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney");
    }
}
