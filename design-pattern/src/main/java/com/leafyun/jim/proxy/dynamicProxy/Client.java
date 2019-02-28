package com.leafyun.jim.proxy.dynamicProxy;

import com.leafyun.jim.proxy.staticProxy.ProxyStar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2019-02-13
 * @time: 12:30
 */
public class Client {
    public static void main(String[] args) {
        Star star = new RealStar();
        StarHandler handler = new StarHandler(star);

        // 创建代理类，proxy 也实现了 Star 抽象角色，也拥有抽象角色的方法
        // proxy 代理类实际上实现了 Star 抽象角色，也拥有 handler 对象，在执行每个方法的时候执行 handler.invoke 的方法。直接执行方法的时候到统一处理接口
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

        proxy.confer();
        proxy.signContract();
        proxy.sing();
        proxy.collectMoney();


    }
}
