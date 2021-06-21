package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDateTime.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);
    }
}
