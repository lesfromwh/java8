package com.ls.stop;

/**
 * @author liushuang 2017/11/3
 */
public class StopThreadUnsafe {

    public static User u = new User();


    public static class ChangeObjectThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (u) {
                    int v = (int) (System.currentTimeMillis() / 1000);
                    u.setId(v);
                    try {
                        Thread.sleep(100);
//                        wait(100);
                        //wait 和 sleep
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    u.setName(String.valueOf(v));
                }
                Thread.yield();
            }
        }
    }

    public static class ReadObjectThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (u) {
                    if (u.getId() != Integer.parseInt(u.getName())) {
                        System.out.println(u.toString());
                    }
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new ReadObjectThread().start();
        while (true) {
            ChangeObjectThread thread = new ChangeObjectThread();
            thread.start();
            Thread.sleep(150);
            thread.stop();
        }
    }
}
