package com.company;

public class Main {

    public static void main(String[] args) {
        // Switch Statement
        String gender = "da";
        if (gender.equals("Male")) {

        } else if (gender.equals("Prefer_Not_Say")) {

        } else {

        }

        switch (gender.toUpperCase()){
            case "Female":
                System.out.println("I am a female");
                break;
            case "Male":
                System.out.println("I am a male");
                break;
            case "Prefer_Not_Say":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("Unknown Gender");
        }
    }
}
