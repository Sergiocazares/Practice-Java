package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //String (data type) | name (name) | new String (object)
        String name = new String("Alex");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = new String("lex");
        System.out.println(name.contains("lex"));
    }
}
