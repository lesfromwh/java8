package com.ls.arraylist;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * @author liushuang 2017/11/6
 */
public class ArrayListMultiThread {
    static ArrayList<Integer> list = new ArrayList<>();

    public static class AddThread implements Runnable {
        @Override
        public void run() {
            for (int i =0;i<100000;i++) {
                list.add(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list.size());
    }
}
