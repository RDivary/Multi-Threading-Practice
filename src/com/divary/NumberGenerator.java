package com.divary;

import java.util.Random;

public class NumberGenerator {

    private final int maxNumber;

    public NumberGenerator(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int randomNumber () {

        Random random = new Random();
        return random.nextInt(maxNumber + 1);
    }
}
