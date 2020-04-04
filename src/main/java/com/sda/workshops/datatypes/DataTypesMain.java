package com.sda.workshops.datatypes;

import java.util.Arrays;

public class DataTypesMain {

    public static void main(String[] args) {
        //swapNumbers(140,15);
        //generateNumber();
        charArrayToString();
    }

    public static void charArrayToString() {
        char[] charArray = "Labas".toCharArray();
        System.out.println("Object.toString() metodas - " + charArray.toString());
        System.out.println("Arrays.toString() metodas - " + Arrays.toString(charArray));
        int[] intArray = new int[] {5,6};
        System.out.println("Object.toString() metodas - " + intArray.toString());
        System.out.println("new String(arg) metodas - " + new String(charArray));
        System.out.println("Integer.toString(arg) metodas - " + Integer.toString(5));
    }

    public static void swapNumbers(int a, int b) {
        int aOriginal = a;
        int bOriginal = b;
        b = aOriginal;
        a = bOriginal;
        System.out.printf("Before swap a=%d and b=%d after swap a=%d and b=%d",
                aOriginal, bOriginal, a, b);

    }

    public static void generateNumber() {
        double a;
        double d = 0;
        for (int i = 0; i <=5; i++){
            a=5*Math.pow(10,i);
            double c = a + d;
            d=c;
            System.out.println(c);
    }
}


}
