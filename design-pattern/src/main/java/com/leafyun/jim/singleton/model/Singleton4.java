package com.leafyun.jim.singleton.model;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 单例模式四：静态内部类，好处：线程安全，懒加载（真正用时才加载，不会浪费），调用效率高，没有同步代码
 * @description: 依然还是懒加载，因为外部类没有 static 属性，只有调用 getInstance() 方法才会加载静态内部类，从而加载内部列里面的静态实例
 * @date: 2018-12-17
 * @time: 18:25
 */
public class Singleton4 {
    /**
     * 静态内部类
     */
    private static class StaticSingleton {
        // static 是保证内存中只有一份实例，final 保证只能被赋值一次，所以线程安全
        private static final Singleton4 singleton4 = new Singleton4();
    }

    /**
     * 私有构造方法
     */
    private Singleton4() {
    }

    /**
     * 全局的唯一访问点
     *
     * @return
     */
    public static Singleton4 getInstance() {
        return StaticSingleton.singleton4;
    }
}
