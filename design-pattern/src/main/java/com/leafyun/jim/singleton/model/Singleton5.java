package com.leafyun.jim.singleton.model;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 单例模式五：枚举类实现，好处：本身就是单例模式，由 jvm 从根本上保证提供保障（避免被序列化和反射破解）。线程安全，调用效率高，没有同步代码，坏处：立即加载，没有懒加载
 * @description: public final class Singleton5 extends Enum 内部继承枚举类
 * @date: 2018-12-17
 * @time: 18:25
 */
public enum Singleton5 {
    // 底层创建的实例就是  public static final Singleton5 SINGLETON_5;
    // 将所有枚举的实例存放在数组中 private static final ColorEnum values[];
    SINGLETON_5;

    /**
     * 定义自己的单例操作
     */
    public void singletonOperation() {

    }


}
