package com.leafyun.jim.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 原型模式
 * @date: 2019-02-13
 * @time: 9:23
 */
public class User implements Cloneable , Serializable {// 实现 cloneable 接口,这是个规范，可克隆
    private String name;
    private Date birthday;

    /**
     * 浅拷贝
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 直接调用 object 父类对象的 clone 方法
        return super.clone();
    }


//    /**
//     * 深拷贝
//     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        // 调用 object 父类对象的 clone 方法
//        Object o = super.clone();
//        User user = (User) o;
//        user.birthday = (Date) this.birthday.clone();
//        return o;
//    }

    public User() {
    }

    public User(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
