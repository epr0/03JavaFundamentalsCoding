package com.sda.javaFundamentalsCodingExercises;

public class DataTypesExercises {

    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;

        System.out.printf("%d + %d = %d", num1, num2, sum);
    }

    public static void printDivision(int num1, int num2) {
        int division = num1 / num2;
        int rest = num1 % num2;

        System.out.printf("%d / %d = %d (remainder:%d)", num1, num2, division, rest);
    }

    public static void printOperationsResult(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8,
                                             int num9, int num10, int num11, int num12, int num13, int num14, int num15, int num16) {
        int op1 = num1 + num2 * num3;
        int op2 = (num4 + num5) % num6;
        int op3 = num7 + num8 * num9 / num10;
        int op4 = num11 + num12 / num13 * num14 - num15 % num16;

        System.out.printf("%d + %d * %d = %d\n", num1, num2, num3, op1);
        System.out.printf("(%d + %d) %s %d = %d\n", num4, num5, "%", num6, op2);
        System.out.printf("%d + %d * %d / %d = %d\n", num7, num8, num9, num10, op3);
        System.out.printf("%d + %d / %d * %d - %d %s %d = %d", num11, num12, num13, num14, num15, "%", num16, op4);
    }

    /**
     * Remember that float only stores a precision of 6-7 digits, if you need more use double
     * <p>
     * https://www.educba.com/java-float-vs-double/
     */
    public static void printExpressionOutput(double num1, double num2, double num3, double num4, double num5, double num6) {
        double result = (num1 * num2 - num3 * num4) / (num5 - num6);

        System.out.printf("((%.1f * %.1f - %.1f * %.1f) / (%.1f - %.1f)) = %.15f", num1, num2, num3, num4, num5, num6,
                result);
    }

    /**
     * Java has support for some of the mathematical constants
     * <p>
     * https://examples.javacodegeeks.com/core-java/math/using-math-constants/
     */
    public static void printCircleAreaAndPerimeter(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = Math.PI * 2 * radius;

        System.out.printf("Circle (radius:%.2f) Area = %.14f\n", radius, area);
        System.out.printf("Circle (radius:%.2f) Perimeter = %.14f", radius, perimeter);
    }

    public static void printNumbersAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;

        System.out.printf("Average (%d, %d, %d) = %d", num1, num2, num3, average);
    }

    public static void printRectangleAreaAndPerimeter(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Rectangle (w=%.1f, h=%.1f) Area = %.2f\n", width, height, area);
        System.out.printf("Rectangle (w=%.1f, h=%.1f) Perimeter = %.2f", width, height, perimeter);

    }

    public static void printSwappedVariables(int a, int b) {
        System.out.printf("Before swap a=%d, b=%d\n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("After swap a=%d, b=%d", a, b);
    }

    public static void printComparison(int num1, int num2) {
        System.out.println("Comparing " + num1 + " - " + num2);

        if (num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2);
        } else {
            System.out.printf("%d != %d\n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }
        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        }
        if (num1 <= num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        }
        if (num1 >= num2) {
            System.out.printf("%d >= %d\n", num1, num2);
        }
    }

    public static void printSumDigits(int number) {
        // storing the original number in an additional variable because
        // it will degrade as we extract its last digits
        int originalNumber = number;
        int sumDigits = 0;

        while (number > 0) {
            sumDigits = sumDigits + number % 10;
            number /= 10;
        }

        System.out.printf("Sum of number %d's digits is: %d", originalNumber, sumDigits);
    }
    
    //convert inches, feet, miles to meters
    public static void convertToMeters(double inches, double feet, double miles, double yards) {
         double inchesToMeters = inches * 0.0254;
         double feetToMeters = feet * 0.3048;
         double milesToMeters = miles * 1609;
         double yardsToMeters = yards * 0.914;
         System.out.printf(inches + " inch is %.3f meters", inchesToMeters);
         System.out.println();
         System.out.printf(feet + " feet is %.3f meters", feetToMeters);
         System.out.println();
         System.out.printf(miles + " mile is %.3f meters" , milesToMeters);
         System.out.println();
         System.out.printf(yards + " yard is %.3f meters" , yardsToMeters);
    }
    
    /**
     * Calculate:
     * 1. Acceleration - A = deltaV (difference in speed) / deltaT (difference in time)
     * 	1.1 deltaV = finalSpeed - startSpeed
     *  1.2 deltaT = finalTime - startTime (or time used in total)
     * @param startSpeed
     * @param finalSpeed
     * @param timeUsedInSeconds
     * @param objectMass
     */
    public static void calculateAcceleration(int startSpeed, int finalSpeed, int timeUsedInSeconds, int objectMass) {
    	double deltaSpeed = finalSpeed - startSpeed;
    	double speedInMetersPerSecond = deltaSpeed * 5 / 18;
    	System.out.printf("Speed %.2f km/h is converted to %.2f m/s", deltaSpeed, speedInMetersPerSecond);
    	System.out.println();
    	double acceleration = speedInMetersPerSecond / timeUsedInSeconds;
    	System.out.printf("Acceleration: %.2f m/s^2", acceleration);
    	System.out.println();
    	double distanceTraveled = speedInMetersPerSecond * timeUsedInSeconds;
    	System.out.printf("Distance traveled: %.2f meters", distanceTraveled);
    }
}
