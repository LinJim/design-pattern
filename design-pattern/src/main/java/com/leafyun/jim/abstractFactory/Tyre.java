package com.leafyun.jim.abstractFactory;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 轮胎
 * @date: 2018-12-21
 * @time: 13:13
 */
public interface Tyre {
    void resolve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void resolve() {
        System.out.println("没磨损");
    }
}

class LowTyre implements Tyre{

    @Override
    public void resolve() {
        System.out.println("有磨损");
    }
}

