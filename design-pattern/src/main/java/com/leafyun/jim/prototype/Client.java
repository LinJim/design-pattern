package com.leafyun.jim.prototype;

import java.util.Date;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2019-02-13
 * @time: 9:28
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1234568855L);
        User user = new User("用户1", date);
        System.out.println(user);
        System.out.println(user.getBirthday());

        // 浅克隆，复制出不同对象，但是浅克隆出来的新对象还是会适用到原有对象的属性，原有对象修改了属性，新客隆的对象属性也会修改
        // 深克隆，复制出不同对象，深克隆出来的新对象不会适用到原有对象的属性，原有对象修改了属性，新客隆的对象属性不会修改，因为它是自己的新属性
        User clone = (User) user.clone();
        System.out.println(clone);
        System.out.println(clone.getBirthday());
        date.setTime(55555555L);
        System.out.println(user.getBirthday());
        System.out.println(clone.getBirthday());

    }
}
