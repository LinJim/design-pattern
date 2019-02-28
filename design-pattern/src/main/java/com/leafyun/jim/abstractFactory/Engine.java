package com.leafyun.jim.abstractFactory;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 发动机
 * @date: 2018-12-21
 * @time: 13:11
 */
public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");

    }
}

class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");

    }
}

