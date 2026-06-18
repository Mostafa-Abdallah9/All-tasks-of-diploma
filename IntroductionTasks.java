package com.pioneers.$01introduction.tasks;

import java.util.Scanner;

public class IntroductionTasks {
    public static void main(String[] args) {
        // Question 1
        int intNumber = 2;
        System.out.println(intNumber);
        intNumber += 2;
        System.out.println(intNumber);
        intNumber += 2;
        System.out.println(intNumber);
        intNumber += 2;
        System.out.println(intNumber);
        intNumber += 2;
        System.out.println(intNumber);

        System.out.println("-------------------------------------------------------------------");

        // Question 2
        final int cm = 199;
        final float meter = (float) cm / (float) 100;

        System.out.println("centimeter = " + cm + " cm");
        System.out.println("meter = " + meter + " m");

        System.out.println("-------------------------------------------------------------------");

        // Question 3
        final int two = 2;
        final int square = two * two;
        final int cube = square * two;
        final int fourthPower = cube * two;

        System.out.println("two                             = " + two);
        System.out.println("square of the two               = " + square);
        System.out.println("cube of the two                 = " + cube);
        System.out.println("fourth power of the two         = " + fourthPower);

        System.out.println("-------------------------------------------------------------------");

        // Question 4 -- Write a Java program to break an integer into a sequence of three digits.
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the three digits number: ");

        final int threeDigitsNumber = scanner.nextInt();
        final int thirdDigit = threeDigitsNumber % 10;
        final int secondDigit = (threeDigitsNumber % 100) / 10;
        final int firstDigit = (threeDigitsNumber % 1000) / 100;
        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit);
    }
}
