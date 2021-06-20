package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Loops
        int [] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Reverse Order
        for (int i = numbers.length -1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
