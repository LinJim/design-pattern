package com.leafyun.jim.adpter;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 适配器，相当于 USB/ps/2 转接口
 * @date: 2019-02-13
 * @time: 11:40
 */
public class Adapter extends Adaptee implements Target{// 适配器，继承被适配的类，和实现目标对象，它就是相当于 USB/ps/2 转接口

    @Override
    public void handleReq() {
         super.request();
    }
}
