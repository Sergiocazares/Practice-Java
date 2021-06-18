package com.company;

public class Main {

    public static void main(String[] args) {
        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = false;
        boolean isSergioMember = true;
        System.out.println((!isAdult || isStudent) && !isSergioMember);
        System.out.println(!isAdult);
        String name = "Alex";
        System.out.println(10 > 8 || 2 <= 2 && isAdult && name.contains("A"));

    }
}
