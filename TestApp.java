package com.pioneers.$01introduction;

public class TestApp {
    public static void main(String[] args) {
        // 0 ==> 0 0 0 0 0 0 0 0
        // 1 ==> 0 0 0 0 0 0 0 1
        // 2 ==> 0 0 0 0 0 0 1 0

        byte byteValue1 = 6;
        System.out.println("byteValue1 = " + byteValue1);

        Byte byteValue2 = 7;
        System.out.println("byteValue2 = " + byteValue2);

        short shortValue1 = 200;
        System.out.println("shortValue1 = " + shortValue1);

        Short shortValue2 = 200;
        System.out.println("shortValue2 = " + shortValue2);

        int num1 = 200;
        Integer num2 = 200;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        long longValue1 = 2147483648L;
        System.out.println("longValue1 = " + longValue1);

        Long longValue2 = 2147483648L;
        System.out.println("longValue2 = " + longValue2);

        System.out.println(Long.MAX_VALUE);

        float floatValue1 = 3.14F;
        System.out.println("floatValue1 = " + floatValue1);

        Float floatValue2 = 99999999999999999999999999999999999999.9F;
        System.out.println("floatValue2 = " + floatValue2);

        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        double doubleValue1 = 999999999999999999999999999999999999999.99999991;
        System.out.println("doubleValue1 = " + doubleValue1);

        Double doubleValue2 = 3.14;
        System.out.println("doubleValue2 = " + doubleValue2);

        char charValue1 = '%';
        System.out.println("charValue1 = " + charValue1);

        Character charValue2 = '}';
        System.out.println("charValue2 = " + charValue2);

        boolean booleanValue1 = Boolean.TRUE;
        System.out.println("booleanValue1 = " + booleanValue1);

        Boolean booleanValue2 = false;
        System.out.println("booleanValue2 = " + booleanValue2);

        {
            String name = "Abdelaziz Said";
            System.out.println("name = " + name);
        }

    }
}
