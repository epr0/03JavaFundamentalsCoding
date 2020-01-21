package com.sda.javaFundamentalsCodingExercises;

public class StringExercises {


    /**
     * Printing can be done in many different ways in java
     *
     * Check out format printing: https://www.baeldung.com/java-printstream-printf
     */
    public static void printHelloName(String name) {
        System.out.println("Printing hello name:");

        System.out.printf("Hello \n%s", name);
    }

    public static void printStringPattern() {
        System.out.println("Printing pattern:");

        System.out.println("   J     a   v     v    a");
        System.out.println("   J    a a   v   v    a a");
        System.out.println("J  J   aaaaa   v v    aaaaa");
        System.out.println(" JJ   a     a   v    a     a");
    }

    /**
     * String offers quite a few built in methods like toLowerCase, toUpperCase, trim, etc
     *
     * https://www.w3schools.com/java/java_ref_string.asp
     */
    public static void printStringLowercase(String string) {
        System.out.println("Converting string to lowercase: " + string);

        System.out.println(string.toLowerCase());
    }

    /**
     * StringBuilder is a utility class that offers additional functionality when working with strings
     *
     * https://www.javatpoint.com/StringBuilder-class
     */
    public static void printStringReversed(String string) {
        System.out.println("Printing string reversed: " + string);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(string);

        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());
    }

    /**
     * Length and substring are two of the very useful built in string methods
     *
     * https://beginnersbook.com/2013/12/java-string-substring-method-example/
     */
    public static void printFistHalfOfString(String string) {
        System.out.println("Printing first half of string: " + string);

        int stringLength = string.length();
        String firstHalf = string.substring(0, stringLength/2);

        System.out.println(firstHalf);
    }

    /**
     * For simple string concatenations it's ok to use + but when concatenating in a loop always remember
     * to use StringBuilder
     *
     * https://stackoverflow.com/questions/1532461/stringbuilder-vs-string-concatenation-in-tostring-in-java
     */
    public static void printStringsConcatenatedWithoutFirstLetter(String string1, String string2) {
        System.out.println("Concatenating strings without first letter: " + string1 + " - " + string2);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(string1.substring(1));
        stringBuilder.append(string2.substring(1));

        System.out.println(stringBuilder.toString());
    }


    public static void printStringLength(String string) {
        System.out.println("Printing string length: " + string);

        System.out.printf("The string \"%s\" is %d characters long!", string, string.length());
    }

    /**
     * Comparing string in java can be done with == or equals
     * ==     - compares references (addresses in memory)
     * equals - compares values
     *
     * https://www.javatpoint.com/string-comparison-in-java
     */
    public static void printStringComparison(String string1, String string2) {
        System.out.println("Printing strings comparison: " + string1 + " - " + string2);

        if (string1.equalsIgnoreCase(string2)) {
            System.out.printf("The strings (\"%s\", \"%s\") are lexicographically equal!", string1, string2);
        } else {
            System.out.printf("The strings (\"%s\", \"%s\") are not lexicographically equal!", string1, string2);
        }
    }

    public static void printIfStringEndsWithString(String string1, String string2) {
        System.out.println("Printing if string ends with: " + string1 + " - " + string2);

        String endOfString = string1.substring(string1.length() - string2.length());

        if (endOfString.equalsIgnoreCase(string2)) {
            System.out.printf("The string \"%s\" ends with \"%s\"!", string1, string2);
        } else {
            System.out.printf("The string \"%s\" doesn't ends with \"%s\"!", string1, string2);
        }
    }


    /**
     * Regexes help you identify certain patterns in a String
     *
     * https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
     */
    public static void printStringCharacterCount(String string) {
        System.out.println("Printing string character count: " + string);

        int lettersCount = 0;
        int spacesCount = 0;
        int numbersCount = 0;
        int othersCount = 0;


        for (int i=0; i<string.length(); i++) {
            if (string.substring(i,i+1).matches("[a-zA-Z]")) {
                lettersCount++;
                continue;
            }

            if (string.substring(i,i+1).matches(" ")) {
                spacesCount++;
                continue;
            }

            if (string.substring(i,i+1).matches("[0-9]")) {
                numbersCount++;
                continue;
            }

            othersCount++;
        }

        System.out.printf("The string \"%s\" contains %d letters, %d spaces, %d numbers, %d others", string, lettersCount, spacesCount, numbersCount,
                othersCount);
    }
}
