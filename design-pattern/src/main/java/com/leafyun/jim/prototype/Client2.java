package com.leafyun.jim.prototype;

import java.io.*;
import java.util.Date;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2019-02-13
 * @time: 10:43
 */
public class Client2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date(1234568855L);
        User user = new User("用户1", date);
        System.out.println(user);
        System.out.println(user.getBirthday());

        // 序列化和反序列化实现深复制
        // 字节输出流
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        // 对象序列化输出流
        ObjectOutputStream os=new ObjectOutputStream(bos);
        os.writeObject(user);

        // 对象存到字节数组里面
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream oi=new ObjectInputStream(bis);
        User clone = (User)oi.readObject();

        System.out.println(clone);
        System.out.println(clone.getBirthday());
        date.setTime(55555555L);
        System.out.println(user.getBirthday());
        System.out.println(clone.getBirthday());

    }
}
