package com.leafyun.jim.singleton.test;

import com.leafyun.jim.singleton.model.*;

import java.util.concurrent.CountDownLatch;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 对几种单例进行性能测试: 每个单例实现调用一百万次，看看时间消耗
 * @date: 2018-12-17
 * @time: 20:21
 */
public class PerformTest {

    // main 方法主线程
    public static void main(String[] args) {
        int threadNum = 10;
        // 说白了就是一个计数器同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待,Latch 占有
        final CountDownLatch count = new CountDownLatch(threadNum);
        // 开始时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    //Singleton4.getInstance();
                    Singleton5 singleton1 = Singleton5.SINGLETON_5;
                }
                // 当前线程调用此方法，计数减一
                count.countDown();
            }).start();
        }
        try {
            // 一直阻塞当前线程（阻塞当前 main 线程，等到计算完），直到计数器为 0
            count.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 结束时间
        long end = System.currentTimeMillis();
        System.out.println("总耗时： " + (end - start));
    }
}
