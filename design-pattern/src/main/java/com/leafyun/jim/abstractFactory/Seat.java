package com.leafyun.jim.abstractFactory;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 座椅
 * @date: 2018-12-21
 * @time: 13:12
 */
public interface Seat {
    void message();
}

class LuxurySeat implements Seat{

    @Override
    public void message() {
        System.out.println("可以按摩");
    }
}

class LowSeat implements Seat{

    @Override
    public void message() {
        System.out.println("普通椅子");
    }
}