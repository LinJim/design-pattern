package com.leafyun.jim.singleton.model;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 单例模式二：懒汉式，好处：线程安全，懒加载（真正用时才加载，不会浪费）；坏处，调用效率低，因为有同步代码
 * @date: 2018-12-17
 * @time: 18:25
 */
public class Singleton2 {
    /**
     * static 随着类装载的时候初始化
     */
    private static Singleton2 singleton2 = null;

    /**
     * 私有构造方法
     */
    private Singleton2() {
    }

    /**
     * 全局的唯一访问点，有同步代码，调用效率低
     * 当第一个线程进去方法，方法就会被锁住，等到第一个线程创建完实例，之后的线程才能进去，这时候第二个线程就得到第一个线程创建的实例，以后的线程也是，所以为单例
     *
     * @return
     */
    public synchronized static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
