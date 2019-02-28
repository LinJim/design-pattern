package com.leafyun.jim.singleton.model;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 单例模式一：饿汉式，好处：线程安全；调用效率高，因为没有同步代码，坏处：立即加载，没有懒加载；因为如果你不去调用 getInstance() 资源就浪费了
 * @date: 2018-12-17
 * @time: 18:25
 */
public class Singleton1 implements Serializable {
    /**
     * final 可写可不写，反正都是固定值；static 随着类装载的时候初始化（虚拟机只会装载一次该类，而且虚拟机加载类是天然的线程安全模式），所以 singleton1 实例只有一份，线程安全
     */
    private static final Singleton1 singleton1 = new Singleton1();

    /**
     * 私有构造方法
     */
     private Singleton1() {
        if (singleton1 != null) {
            throw new RuntimeException("不支持自定义构造");
        }
    }

    /**
     * 全局的唯一访问点，没有同步代码，调用效率高
     *
     * @return
     */
    public static Singleton1 getInstance() {
        return singleton1;
    }

    // 反序列化的时候，其实会回调这个方法 readResolve()
    private Object readResolve() throws ObjectStreamException {
        return singleton1;

    }
}
