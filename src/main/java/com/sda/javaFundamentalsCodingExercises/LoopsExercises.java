package com.sda.javaFundamentalsCodingExercises;

import java.util.stream.IntStream;

public class LoopsExercises {

    public static void printMultiplicationTable(int number) {
        System.out.printf("Number %d's multiplication table: ", number);

        for (int i = 1; i <= 10; i++) {
            System.out.print((number * i) + " ");
        }
    }

    public static void printEvenNumbers(int threshold) {
        System.out.printf("Even numbers up to %d: ", threshold);

        for (int i = 1; i <= threshold; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printLoop(int number) {
        System.out.print(number + " => " + number + " ");

        int previous = number;
        for (int i = 1; i <= number; i++) {
            int current = (int) (number * Math.pow(10, i) + previous);
            System.out.printf(current + " ");
            previous = current;
        }
    }

    public static void printDivisibleBy(int threshold) {
        Integer[] divisibleByThree = new Integer[threshold];
        Integer[] divisibleByFive = new Integer[threshold];
        Integer[] divisibleByFifteen = new Integer[threshold];

        int threeCounter = 0;
        int fiveCounter = 0;
        int fifteenCounter = 0;

        for (int i = 1; i < threshold; i++) {
            if (i % 3 == 0) {
                divisibleByThree[threeCounter] = i;
                threeCounter++;
            }
            if (i % 5 == 0) {
                divisibleByFive[fiveCounter] = i;
                fiveCounter++;
            }
            if (i % 15 == 0) {
                divisibleByFifteen[fifteenCounter] = i;
                fifteenCounter++;
            }
        }

        System.out.print("Divisible by 3 - ");
        for(int i=0; i< threeCounter; i++) {
            System.out.print(divisibleByThree[i] + " ");
        }

        System.out.print("\nDivisible by 5 - ");
        for(int i=0; i< fiveCounter; i++) {
            System.out.print(divisibleByFive[i] + " ");
        }

        System.out.print("\nDivisible by 3 & 5 - ");
        for(int i=0; i< fifteenCounter; i++) {
            System.out.print(divisibleByFifteen[i] + " ");
        }
    }

    public static void printPowers(int number, int threshold) {
        System.out.printf("Powers of number %d up to %d: ", number, threshold);

        for (int i = number; i < threshold; i = i * number) {
            System.out.print(i + " ");
        }
    }

    public static void printFibonacciSeries(int threshold) {
        System.out.printf("Fibonacci series of %d terms: ", threshold);

        int secondToLast = 0;
        int last = 1;
        int counter = 2;

        System.out.print(secondToLast + " " + last + " ");

        while (counter < threshold) {
            int current = secondToLast + last;
            secondToLast = last;
            last = current;

            System.out.print(last + " ");
            counter++;
        }
    }

    public static void printPyramidPattern(int threshold) {
        int it = 1;

        for (int i = 1; i <= threshold; i++) {
            for (int j = 1; j <= threshold - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < it; j++) {
                System.out.print(i);
            }
            System.out.println("");
            it += 2;
        }
    }

    public static void printPrimeNumbers(int threshold) {
        System.out.printf("First %d prime numbers: ", threshold);

        int primeNumbersCount = 1;
        int numberToCheck = 2;

        while (primeNumbersCount <= threshold) {
            if (isPrime(numberToCheck)) {
                primeNumbersCount++;
                System.out.print(numberToCheck + " ");
            }
            numberToCheck++;
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }


    public static void printIncrementedNumbers(int number) {
        int increment = number;

        System.out.printf("First %d numbers (incremented by %d): %d ", number, number, number);

        for (int i = 2; i <= increment; i++) {
            number = number + increment;

            System.out.print(number + " ");
        }
    }

    public static void printFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.printf("Factorial of %d is: %d\n\n", number, factorial);
    }
    
    public static void fizzBuzz(int num) {
    	for (int i = 1; i <= num; i++) 
    	{
    	    if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
    	        System.out.println("fizzbuzz");
    	    else if ((i % 5) == 0) // Is it a multiple of 5?
    	        System.out.println("fizz");
    	    else if ((i % 7) == 0) // Is it a multiple of 7?
    	        System.out.println("buzz");
    	    else
    	        System.out.println(i); // Not a multiple of 5 or 7
    	}
    }
    
    public static void fizzBuzzInJava8(int num) {
        IntStream.rangeClosed(1, num)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
