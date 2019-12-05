package com.ifmo.lesson20.treadMytread;

import java.util.ArrayList;

public class Threads {

    public static void main(String[] args) throws InterruptedException {
           System.out.println(Thread.currentThread().getName());
      //  ArrayList threads = new ArrayList();

       // for (int i = 0; i < 10; i++) {
        //    Thread thread = new Thread(new FirstThread());
        //    thread.start();
        //   threads.add(i);
        }


   




    public static class FirstThread implements Runnable {
        @Override
        public void run() {
            System.out.printf("Hello, multithreaded! (%s)\n",
                    Thread.currentThread().getName());
        }
    }
}


