package com.pioneers.$01introduction;

public class CastingMain {
    public static void main(String[] args) {
        byte num1 = 5;          // 00001001
        int num2 = num1;        // 00000000000000000000000000001001
        System.out.println("num2 = " + num2);

        int num3 = 200;
        byte num4 = (byte) num3;

        System.out.println("num4 = " + num4);

        int num5 = 6;
        float num6 = (float) num5;

        System.out.println("num6 = " + num6);

        double num7 = 6.1;
        float num8 = (float) num7;
        System.out.println("num8 = " + num8);

        final float num9 = 3.14F;
        final int num10 = (int) num9;
        System.out.println("num10 = " + num10);

        // String Concatenation
        final String firstName = "Khaled";
        final String lastName = "Salman";
        final String khaledFullName = firstName + " " + lastName;

        System.out.println("khaledFullName = " + khaledFullName);

        final int khaledAge = 22;
        final String khaledAddress = "Giza";

        final String khaledInfo = khaledFullName + ", age = " + khaledAge;
        System.out.println(khaledInfo);

        final String khaledInfoWithAddress = khaledInfo + ", address = " + khaledAddress;
        System.out.println("khaledInfoWithAddress: " + khaledInfoWithAddress);
    }
}
