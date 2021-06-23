package com.company;

public class Main {

    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens( "sony", "85mm", true);
        Lens lensTwo = new Lens( "sony", "30mm", true);
        Lens lensThree = new Lens( "sony", "24-70mm", false);

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }

}
