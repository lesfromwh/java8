package src.com.ls.java8.lambda2;

import org.junit.Test;

/**
 * @author liushuang 2017/11/16
 */
public class ThreadExample {

    public static void main(String[] args) {
//        thread1();
        thread2();;
    }

    private static void thread1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=5; i++)
                    System.out.println("开启多线程");
            }
        }).start();
    }

    private static void thread2() {
        new Thread(()-> {
            for (int i=1;i<=5;i++) {
                System.out.println("lambda开启多线程");
            }
        }).start();
    }
}
