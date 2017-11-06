package com.ls.jdkconcurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁
 * @author liushuang 2017/11/6
 */
public class ReenterLock implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();

    public static int i = 0;

    @Override
    public void run() {
        for (int j=0;j<1000000;j++) {
            lock.lock();
            try {
                i++;
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLock l1 = new ReenterLock();
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
