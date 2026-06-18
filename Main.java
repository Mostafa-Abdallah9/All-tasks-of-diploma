package com.pioneers.$05methods;

public class Main {
    public static void main(String[] args) {
        welcomeStudent("Mostafa", 24);
        welcomeStudent("Elsayed", 29);
        welcomeStudent("Amgaddd", 29);
        welcomeStudent("Khaledd", 26);

    }

    public static void welcomeStudent(final String name, final int age) {
        final String welcomeMessage = String.format(
                "Welcome %s with age = %d to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!",
                name, age
        );
        System.out.println(welcomeMessage);
    }

    public static void welcomeDiplomaStudents() {
        System.out.println("Welcome Mostafa to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
        System.out.println("Welcome Elsayed to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
        System.out.println("Welcome Amgaddd to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
        System.out.println("Welcome Khaledd to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
    }

    public static void welcomeAdditionalStudents() {
        welcomeDiplomaStudents();
        System.out.println("Welcome Amrrrrr to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
        System.out.println("Welcome Alshymaa to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
        System.out.println(
                "Welcome Abdelrahman to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
    }

    public static void welcomeStudents() {
        System.out.println("Welcome to Java Principles and OOP with Data Structures at Tech Pioneers Hub!!");
    }

    public static void informMaterials() {
        System.out.println("Material are .... ");
    }

    public static void informCourseDates() {
        System.out.println("Course Starting date at: April, 2026");
        System.out.println("Course end date at: June, 2026");
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }
}
