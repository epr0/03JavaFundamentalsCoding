package com.sda.workshops.datatypes;

import java.sql.SQLOutput;

public class DataTypes {

    public static void printSum(int x, int y) {
        System.out.printf("%d + %d =  %d", x, y, x+y);
    }

    //Write a Java program to print the area and perimeter of a rectangle: Width = 5.5; Height = 8.5
    //Output: Area = 47.60; Perimeter = 28.20

    public static void testRectangle(double width, double height) {
        double area = width * height; //skaiciuojam plota
        double perimeter = 2 * (width + height);

        System.out.printf("Plotas " + area + " perimetras " + perimeter);
    }

    public static void swapNumbers(int a, int b) {
        int aOriginal = a;
        int bOriginal = b;
        b = aOriginal;
        a = bOriginal;
        System.out.printf("Before swap a=%d and b=%d after swap a=%d and b=%d",
                aOriginal, bOriginal, a, b);

    }

    public static void printComparison(int number1, int number2) {
        System.out.println("Lyginam " + number1 + " " + number2);
        System.out.println();

        if(number1 == number2) {
            //lygu
            System.out.printf("%d == $d\n", number1, number2);
        } else {
            //nelygu
            System.out.printf("%d != %d\n", number1, number2);
        }

        if(number1 < number2) {
            System.out.printf("%d < %d\n", number1, number2);
        }

        if(number1 > number2) {
            System.out.printf("%d > %d\n", number1, number2);
        }

        if(number1 <= number2) {
            System.out.printf("%d <= %d\n", number1, number2);
        }

        if(number1 >= number2) {
            System.out.printf("%d >= %d\n", number1, number2);
        }


    }
}
