package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //int b is untouched lives in diff memory (b=10 , a=100)
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a  + " - b = '" +b);


        //reference type , both reference to object person("alex")
        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}
