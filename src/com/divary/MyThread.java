package com.divary;

import static java.lang.Thread.sleep;

public class MyThread extends Thread {

    private final String name;
    private final int sleep;

    public MyThread(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++){
                System.out.println(name + ' ' + i);
                sleep(sleep);
            }
        } catch (Exception err){
            System.err.println(err);
        }
    }
}
