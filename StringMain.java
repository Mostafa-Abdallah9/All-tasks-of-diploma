package com.pioneers.$05methods;

public class StringMain {
    public static void main(String[] args) {

        Main.welcomeStudents();

        String firstName = new String("mostafa");
        String lastName = new String("mostafa");
        System.out.println(firstName == lastName);

        System.out.println("*************************************************");

        System.out.println(firstName.equals(lastName));

        System.out.println("*************************************************");

        System.out.println(firstName.equalsIgnoreCase(lastName));

        System.out.println("*************************************************");

        StringBuilder firstName1 = new StringBuilder("mostafa");
        System.out.println(firstName == firstName1.toString());

        System.out.println("*************************************************");

        System.out.println("--------" + firstName.equals(firstName1.toString()));

        System.out.println("*************************************************");

        System.out.println(firstName.equalsIgnoreCase(firstName1.toString()));

        System.out.println("*************************************************");

        StringBuilder lastName1 = new StringBuilder("mostafa");
        System.out.println("========" + (firstName1 == lastName1));

        System.out.println("*************************************************");
        System.out.println(firstName1.equals(lastName1));

        System.out.println("*************************************************");

        if (firstName == firstName1.toString()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("*************************************************");

        if (firstName.equals(firstName1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
