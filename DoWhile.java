package com.pioneers.$04loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        do {
            if (age == 15) {
                age += 1;
                continue;
            }
            System.out.println("Try again later");
            age += 1;
        } while (age < 18);

        System.out.println("End of program");
    }
}
