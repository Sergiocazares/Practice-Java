package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Non primitive data types AKA reference types
        String name = new String("Sergiocode");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
    }
}
