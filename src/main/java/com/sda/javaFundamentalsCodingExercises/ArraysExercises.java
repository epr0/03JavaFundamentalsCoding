package com.sda.javaFundamentalsCodingExercises;

import java.util.Arrays;

public class ArraysExercises {

    public static void printSumOfArrayElements(Integer[] array) {
        int sumOfArray = 0;

        for (Integer i : array) {
            sumOfArray = sumOfArray + i;
        }

        System.out.println("Sum of array's " + Arrays.toString(array) + " elements is: " + sumOfArray);
    }

    public static void printAverageOfArrayElements(Integer[] array) {
        int sumOfArray = 0;

        for (Integer i : array) {
            sumOfArray = sumOfArray + i;
        }

        double average = sumOfArray / array.length;

        System.out.println("Average of array's " + Arrays.toString(array) + " elements is: " + average);
    }

    public static void printOddElementsInArray(Integer[] array) {
        System.out.print("Odd elements in array " + Arrays.toString(array) + " : ");

        for (Integer i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printMaxAndMinOfArray(Integer[] array) {
        // initializing the min and max with the first element of the array
        // if any other elements are bigger/smaller we'll update these variables
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Array " + Arrays.toString(array) + " has max=" + max + " and min=" + min);
    }

    public static void printReversedArray(Integer[] array) {
        Integer[] arrayClone = array.clone();
        System.out.println("Array: " + Arrays.toString(arrayClone));

        for (int i = 0; i < arrayClone.length / 2; i++) {
            int temp = arrayClone[i];
            arrayClone[i] = arrayClone[array.length - i - 1];
            arrayClone[arrayClone.length - i - 1] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arrayClone));
    }


    public static void printNumberOfEvenAndOddElementsInArray(Integer[] array) {
        int even = 0;
        int odd = 0;

        for (Integer i : array) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Array " + Arrays.toString(array) + " has even=" + even + " and odd=" + odd);
    }

    public static void printInsertedElementAtPosition(Integer[] array, int value, int position) {
        Integer[] newArray = new Integer[array.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        newArray[position] = value;

        for (int i = array.length; i > position; i--) {
            newArray[i] = array[i - 1];
        }

        System.out.println(Arrays.toString(array) + " -> " + Arrays.toString(newArray));
    }


    public static void printDuplicateArrayValues(Integer[] array) {
        System.out.print("Array: " + Arrays.toString(array) + " duplicate values: ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i].equals(array[j])) && (i != j)) {
                    System.out.print(array[j] + " ");
                }
            }
        }
    }

    public static void printSecondLargestValue(Integer[] array) {
        int max = 0;
        int secondMax = 0;

        for (Integer i : array) {
            if (i > max) {
                max = i;
            }
            if (i > secondMax && i < max) {
                secondMax = i;
            }
        }

        System.out.println("Second largest element in array " + Arrays.toString(array) + " is: " + secondMax);
    }

    public static void printArrayPairs(Integer[] array, int sum) {
        System.out.print("Pairs of elements in array " + Arrays.toString(array) + " with sum: " + sum + " are: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.print(array[i] + "-" + array[j] + " ");
                }
            }
        }
    }
}
