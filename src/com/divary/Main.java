package com.divary;

public class Main {

    public static void main(String[] args) {

        // You can chose one
        multiThread();
        methodSynchronized();
        // You can chose one

    }

    public static void multiThread() {

        MyThread secondThread1 = new MyThread("First thread", 1000);
        secondThread1.start();


        MyThread secondThread2 = new MyThread("Second thread", 500);
        secondThread2.start();

    }

    public static void methodSynchronized() {

        NumberGenerator numberGenerator = new NumberGenerator(1000);
        for (int i = 0; i < 3; i++){
            new ThreadNumber(numberGenerator).start();
        }
    }
}
