package com.stackroute.pe2;

public class EvenNumber {
    boolean result;
    public boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
