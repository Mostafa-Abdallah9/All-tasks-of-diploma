package com.pioneers.$04loops;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        String name = "Mostafa";
        name = name + " ";
        name = name + "Desouky";

        System.out.println(name);

        StringBuilder mutableName = new StringBuilder("Mostafa");
        mutableName.append(" ");
        mutableName.append("Desouky");

        String immutableName = mutableName.toString();
        System.out.println(immutableName);

        StringBuffer mutableNameBuffer = new StringBuffer("Mostafa");
        mutableNameBuffer.append(" ");
        mutableNameBuffer.append("Desouky");

        String immutableBufferName = mutableNameBuffer.toString();
        System.out.println(immutableBufferName);

        final StringBuilder finalName = new StringBuilder(name);
        for (int i = 0; i < 3; i++) {
            finalName.append(i);
        }

        System.out.println(finalName);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        final String firstName = scanner.next();
        System.out.print("Enter your last name: ");
        final String lastName = scanner.next();

        final String fullName = firstName + " " + lastName;
        System.out.println(fullName);


    }
}
