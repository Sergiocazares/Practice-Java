package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Break and Continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
