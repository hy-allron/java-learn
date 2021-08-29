package com.allron.javalearn.多线程.两线程交替打印;

import java.util.concurrent.CountDownLatch;

/**
 * @author Allron
 * @date 2019/10/08
 **/
public class T02_02_sync_wait_notify {
    private static CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) {
        final Object o = new Object();
        new Thread(() -> {
            try {
                latch.await(); // 等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (o) {
                for (int i = 1; i <= 26; i++) {
                    System.out.print(i);
                    try {
                        o.notify(); // 唤醒第二个线程
                        o.wait(); // 让出锁，自己进入等待队列
                        // 注意不能换位置，否则先wait，让出cpu，不能notify了
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify(); // 必须，否则程序无法停止，另一个线程会在等待队列一直等着
            }
        }).start();

        new Thread(() -> {
            synchronized (o) { // 第二个线程先得到锁
                for (char c='A'; c <= 'Z'; c++) {
                    System.out.print(c);
                    latch.countDown();
                    try {
                        o.notify(); // 唤醒第一个线程
                        o.wait(); // 让出锁，自己进入等待队列
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify(); // 必须，否则程序无法停止，另一个线程会在等待队列一直等着
            }
        }).start();

    }
}
