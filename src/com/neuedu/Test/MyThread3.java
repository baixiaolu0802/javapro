package com.neuedu.Test;

/**
 * Created by 13930 on 2020/2/13.
 */
public class MyThread3 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for (int i = 0;i < 100;i++){
                System.out.println(Thread.currentThread().getName()+"线程输出----"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

}
