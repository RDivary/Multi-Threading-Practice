package com.divary;

public class ThreadNumber extends Thread{

    private final NumberGenerator numberGenerator ;

    public ThreadNumber(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator () {

        synchronized (numberGenerator){ // You can comment synchronized, and then see the results
            for ( int i = 0; i < 3; i++){
                System.out.println(getName() + " " + numberGenerator.randomNumber());
            }
        }
    }
}
