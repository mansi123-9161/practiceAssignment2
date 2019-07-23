package com.stackroute.pe2;

public class PowerOfFour {
    int isPowerOfFour(int number) {
        int power = 2, result = 1;
        for (; power != 0; --power)
        {
            result *= 4;
        }
        return result;
    }

}
