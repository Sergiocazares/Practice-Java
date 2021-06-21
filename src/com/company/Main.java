package com.company;

public class Main {

    public static void main(String[] args) {
        // User Defined Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'N');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }

}
