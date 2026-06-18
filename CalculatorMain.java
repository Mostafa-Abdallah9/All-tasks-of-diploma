package com.pioneers.$05methods;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int firstNumberForSum = acceptIntFromUser(scanner, "Please enter the first number for addition: ");
        final int secondNumberForSum = acceptIntFromUser(scanner, "Please enter the second number for addition: ");

        final int summation = sum(firstNumberForSum, secondNumberForSum);
        print("Sum = ", summation);

        final int firstNumberForSubtract = acceptIntFromUser(scanner, "Please enter the first number for subtraction: ");
        final int secondNumberForSubtract = acceptIntFromUser(scanner, "Please enter the second number for subtraction: ");
        final int subtraction = subtract(firstNumberForSubtract, secondNumberForSubtract);
        print("Difference = ", subtraction);

        final int firstNumberForMultiply = acceptIntFromUser(scanner, "Please enter the first number for multiplication: ");
        final int secondNumberForMultiply = acceptIntFromUser(scanner, "Please enter the second number for multiplication: ");
        final int multiplication = multiply(firstNumberForMultiply, secondNumberForMultiply);
        print("Multiplication = ", multiplication);

        final int firstNumberForDivide = acceptIntFromUser(scanner, "Please enter the first number for division: ");
        final int secondNumberForDivide = acceptIntFromUser(scanner, "Please enter the second number for division: ");
        final int division = divide(firstNumberForDivide, secondNumberForDivide);
        print("Division = ", division);
    }

    public static int acceptIntFromUser(final Scanner scanner, final String message) {
        System.out.print(message);

        return scanner.nextInt();
    }

    public static int sum(final int num1, final int num2) {
        return num1 + num2;
    }

    public static int subtract(final int num1, final int num2) {
        return num1 - num2;
    }

    public static int multiply(final int num1, final int num2) {
        return num1 * num2;
    }

    public static int divide(final int num1, final int num2) {
        return num1 / num2;
    }

    public static void print(String message, int number) {
        System.out.println(message + number);
    }

    // TODO: According to YAGNI principle, that method should be removed because it's not used.
    public static int returnResult(final int num1, final int num2, final String operator) {
        return switch (operator) {
            case "+" -> sum(num1, num2);
            case "-" -> subtract(num1, num2);
            case "*" -> multiply(num1, num2);
            case "/" -> divide(num1, num2);
            case "%" -> num1 % num1;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
