package com.sda.javaFundamentalsCodingExercises;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------String Exercises----------------");

        StringExercises.printHelloName("bogdan");

        System.out.println("\n\n");

        StringExercises.printStringPattern();

        System.out.println("\n\n");

        StringExercises.printStringLowercase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");

        System.out.println("\n\n");

        StringExercises.printStringReversed("avaJ");

        System.out.println("\n\n");

        StringExercises.printFistHalfOfString("Programmer");

        System.out.println("\n\n");

        StringExercises.printStringsConcatenatedWithoutFirstLetter("Java", "Fundamentals");

        System.out.println("\n\n");

        StringExercises.printStringLength("This is Java!");

        System.out.println("\n\n");

        StringExercises.printStringComparison("This is a comparison", "THIS is A Comparison");

        System.out.println("\n\n");

        StringExercises.printIfStringEndsWithString("Java exercises", "ses");

        System.out.println("\n\n");

        StringExercises.printStringCharacterCount("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");

        System.out.println("\n\n");




        System.out.println("---------------Data Types Exercises----------------");

        DataTypesExercises.printSum(74, 36);

        System.out.println("\n\n");

        DataTypesExercises.printDivision(50, 3);

        System.out.println("\n\n");

        DataTypesExercises.printOperationsResult(-5, 8, 6, 55, 9, 9, 20, -3, 5, 8, 5, 15, 3, 2, 8, 3);

        System.out.println("\n\n");

        DataTypesExercises.printExpressionOutput(25.5,3.5,3.5,3.5,40.5,4.5);

        System.out.println("\n\n");

        DataTypesExercises.printCircleAreaAndPerimeter(7.5);

        System.out.println("\n\n");

        DataTypesExercises.printNumbersAverage(10, 20, 30);

        System.out.println("\n\n");

        DataTypesExercises.printRectangleAreaAndPerimeter(5.5, 8.5);

        System.out.println("\n\n");

        DataTypesExercises.printSwappedVariables(5, 13);

        System.out.println("\n\n");

        DataTypesExercises.printComparison(25, 39);

        System.out.println("\n\n");

        DataTypesExercises.printSumDigits(133);

        System.out.println("\n\n");




        System.out.println("---------------Loops Exercises----------------");

        LoopsExercises.printMultiplicationTable(8);

        System.out.println("\n\n");

        LoopsExercises.printEvenNumbers(100);

        System.out.println("\n\n");

        LoopsExercises.printLoop(5);

        System.out.println("\n\n");

        LoopsExercises.printDivisibleBy(100);

        System.out.println("\n\n");

        LoopsExercises.printPowers(3, 100);

        System.out.println("\n\n");

        LoopsExercises.printFibonacciSeries(10);

        System.out.println("\n\n");

        LoopsExercises.printPyramidPattern(5);

        System.out.println("\n\n");

        LoopsExercises.printPrimeNumbers(4);

        System.out.println("\n\n");

        LoopsExercises.printIncrementedNumbers(4);

        System.out.println("\n\n");

        LoopsExercises.printFactorial(5);

        System.out.println("\n\n");




        System.out.println("---------------Arrays Exercises----------------");

        Integer[] array1 = { 1, 7, 3, 10, 9 };
        Integer[] array2 = { 1, 7, 3, 7, 10, 1, 9 };
        Integer[] array3 = { 1, 2, 7, 3, 10, 2, 9 };

        ArraysExercises.printSumOfArrayElements(array1);

        System.out.println("\n\n");

        ArraysExercises.printAverageOfArrayElements(array1);

        System.out.println("\n\n");

        ArraysExercises.printOddElementsInArray(array1);

        System.out.println("\n\n");

        ArraysExercises.printMaxAndMinOfArray(array1);

        System.out.println("\n\n");

        ArraysExercises.printReversedArray(array1);

        System.out.println("\n\n");

        ArraysExercises.printNumberOfEvenAndOddElementsInArray(array1);

        System.out.println("\n\n");

        ArraysExercises.printInsertedElementAtPosition(array1, 4, 2);

        System.out.println("\n\n");

        ArraysExercises.printDuplicateArrayValues(array2);

        System.out.println("\n\n");

        ArraysExercises.printSecondLargestValue(array1);

        System.out.println("\n\n");

        ArraysExercises.printArrayPairs(array3, 4);

    }
}
