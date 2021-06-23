package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Classes
        Passport usPassport = new Passport("1234", "United States", LocalDate.of(2025, 1, 1));

        Passport uKPassport = new Passport("1239", "England", LocalDate.of(2030, 1, 1));

    }

    static class Passport {
        String number;
        String country;
        LocalDate expiredDate;

        Passport(String number, String country, LocalDate expiredDate){
            this.number = number;
            this.country = country;
            this.expiredDate = expiredDate;
        }
    }
}
