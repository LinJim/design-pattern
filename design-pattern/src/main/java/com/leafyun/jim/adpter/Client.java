package com.leafyun.jim.adpter;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 客户端，相当于笔记本，只有 USB 接口
 * @date: 2019-02-13
 * @time: 11:36
 */
public class Client {
    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        // 创建适配器,把被适配对象传进来
        Target t= new Adapter2(adaptee);
        // 电脑调用目标对象来打字，但实际上是调用被适配对象的方法
        client.test1(t);
    }
}
