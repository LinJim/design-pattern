package com.leafyun.jim.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2019-02-13
 * @time: 18:01
 */
public class StarHandler implements InvocationHandler {

    private Star realStart;

    public StarHandler(Star realStart) {
        this.realStart = realStart;
    }

    /**
     * 作统一的流程控制
     *
     * @param proxy  代理类
     * @param method 正在使用的方法
     * @param args   方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用方法前
        System.out.println("调用方法前");
        // 激活你调用的方法
        method.invoke(realStart,args);

        // 调用方法后
        System.out.println("调用方法后");
        return null;
    }
}
