package com.leafyun.jim.singleton.model;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 单例模式三：双重检查锁实现，好处：线程安全，懒加载（真正用时才加载，不会浪费）；虽然有同步代码，但是只是第一次创建对象的时候要同步，之后不用，提高了执行的效率，
 * @description: 坏处：由于编译器优化和虚拟机底层内部模型原因偶尔会出问题，不建议使用
 * @date: 2018-12-17
 * @time: 18:25
 */
public class Singleton3 {
    /**
     * static 随着类装载的时候初始化
     */
    private static Singleton3 singleton3 = null;

    /**
     * 私有构造方法
     */
    private Singleton3() {
    }

    /**
     * 全局的唯一访问点
     * 这个方法只有第一个需要同步创建，其他时候不用，效率可观，但是由于编译器优化和 jvm 底层模型偶尔会出问题，不建议使用
     * 同步块细粒度的实现
     *
     * @return
     */
    public static Singleton3 getInstance() {
        // 第一次比如高并发，很多线程争先进去
        // 第二次对象不为 null ，所以直接返回单例
        if (singleton3 == null) {
            // 只有一个线程进入同步块
            synchronized (Singleton3.class) {
                // 为什么要再判断一次呢，其实是为了第一次的时候，虽然只有一个线程进同步块的，但是还是有一些线程在同步块外等待
                // 等第一个线程创建完对象之后，第一次剩下线程进来，再判断对象不为 null，也是就拿到单例对象了
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
