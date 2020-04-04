package com.sda.workshops.homework;

public class StringSymbolCounter2 {

    public static void main(String[] args) {
        countSymbols();
    }

    public static void countSymbols() {
        System.out.println("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");
        symbolCounter("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");
    }

    public static void symbolCounter(String inpString) {
        int counterLetters = 0;
        int counterSpaces = 0;
        int counterDigits = 0;
        int counterOther = 0;
        // Loop through string elements
        for (int i = 0; i < inpString.length(); i++) {
            char c = inpString.charAt(i);
            if (Character.isLetter(c)) {
                counterLetters++;
            } else if (Character.isDigit(c)) {
                counterDigits++;
            } else if (Character.isSpaceChar(c)) {
                counterSpaces++;
            } else {
                counterOther++;
            }
        }
        System.out.println();
        System.out.println(counterLetters + " letters");
        System.out.println(counterDigits + " digits");
        System.out.println(counterSpaces + " spaces");
        System.out.println(counterOther + " others");
        System.out.println();
    }
}

