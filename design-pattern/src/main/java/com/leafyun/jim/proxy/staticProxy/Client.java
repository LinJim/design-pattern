package com.leafyun.jim.proxy.staticProxy;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2019-02-13
 * @time: 12:30
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxy = new ProxyStar(realStar);

        // 代理拥有真实的角色，代理来面谈，签合同，然后真实角色唱歌，然后代理再收钱
        // 即代理能够详细控制访问某个对象的方法，在真实角色唱歌(业务逻辑)之前做统一流程，在真实角色唱歌之后做统一流程
        proxy.confer();
        proxy.signContract();
        proxy.sing();
        proxy.collectMoney();

    }
}
