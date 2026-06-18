package com.pioneers.$04loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        while (age < 18) {
            if (age == 15) {
                age += 1;
                continue;
            }
            System.out.println("Try again later");
            age += 1;
        }
        System.out.println("End of program");
    }
}
