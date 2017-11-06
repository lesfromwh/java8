package com.ls.ThreadGroup;

import java.util.TreeMap;

/**
 * @author liushuang 2017/11/6
 */
public class ThreadGroupName implements Runnable{
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("printGroup");
        Thread t1 = new Thread(threadGroup, new ThreadGroupName(), "t1");
        Thread t2 = new Thread(threadGroup, new ThreadGroupName(), "t2");
        t1.start();
        t2.start();
        System.out.println(threadGroup.activeCount());
        threadGroup.list();
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName() + "-" + Thread.currentThread().getThreadGroup().getName();
        while (true) {
            System.out.println(name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
