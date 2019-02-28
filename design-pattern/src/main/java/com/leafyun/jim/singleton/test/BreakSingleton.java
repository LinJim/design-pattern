package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.Singleton1;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 破解单例和防破解：1. 反序列化破解（防破解就是单例写 readResolve() 方法） 2. 反射取私有构造器破解（防破解就是私有构造器抛出异常）
 * @date: 2018-12-17
 * @time: 20:58
 */
public class BreakSingleton {

    public static void main(String[] args) {
//        // 反射破解单例，先得到 class 对象，再得到私有构造方法，私有构造方法创建新实例
//        try {
//            // 得到 class 对象
//            Class<Singleton1> aClass = (Class<Singleton1>) Class.forName("com.leafyun.jim.singleton.model.Singleton1");
////            Singleton1 singleton11 = aClass.newInstance();
////            System.out.println(singleton11);
//            // 得到私有无参构造方法
//            Constructor<Singleton1> constructor = aClass.getDeclaredConstructor(null);
//            // 设置可访问权限
//            constructor.setAccessible(true);
//            // 构造新实例
//            Singleton1 singleton1 = constructor.newInstance(null);
//            Singleton1 singleton2 = Singleton1.getInstance();
//            System.out.println(singleton1);
//            System.out.println(singleton2);
//            System.out.println(singleton1 == singleton2);
//        } catch (ClassNotFoundException | NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // 通过反序列化来创建新对象
        try {
            Singleton1 singleton1 = Singleton1.getInstance();
            FileOutputStream os = new FileOutputStream("C:/jwt/abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            // 把对象输出到文件上
            oos.writeObject(singleton1);
            // 应该放到 finally 上关，或者用 try catch with
            os.close();
            oos.close();

            // 通过反序列化来创建新对象: 管道对到文件上，向程序读入
            FileInputStream fileInputStream = new FileInputStream("C:/jwt/abc.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            // 把对象输出到文件上
            Singleton1 singleton2 = (Singleton1) objectInputStream.readObject();
            System.out.println(singleton1);
            System.out.println(singleton2);
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
