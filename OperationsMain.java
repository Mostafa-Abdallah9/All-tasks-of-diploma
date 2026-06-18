package com.pioneers.$01introduction;

public class OperationsMain {
    public static void main(String[] args) {
        // Unary Operation
        int num1 = 5;
        num1++;
        System.out.println("num1 = " + num1);

        ++num1;
        System.out.println("num1 = " + num1);

        int num2 = 5;
        System.out.println("num2 = " + num2++);
        System.out.println("num2 = " + num2);

        System.out.println("num2 = " + ++num2);

        num2 = num2 + 1;
        System.out.println("num2 = " + num2);

        num2 += 2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------------------------");

        // Arithmetic Operation
        int num3 = 5;
        int num4 = 6;
        int summation = num3 + num4;
        System.out.println("summation = " + summation);

        int subtraction = num3 - num4;
        System.out.println("subtraction = " + subtraction);

        int multiplication = num3 * num4;
        System.out.println("multiplication = " + multiplication);

        float division = (float) num3 / (float) num4;
        System.out.println("division = " + division);

        System.out.println("----------------------------------------");

        // Shift Operations
        byte num5 = 1;
        byte shiftValue = 7;
        System.out.println(num5 << shiftValue);

        int num6 = 10;
        int shiftedValue = 4;
        System.out.println("shiftedValue = " + (num6 >> shiftedValue));

        // 00000000

        num6 >>= shiftedValue;
        System.out.println("num6 = " + num6);

        // Relational Operation
        final int num7 = 10;
        final int num8 = 7;

        final boolean isNum7GreaterNum8 = num7 > num8;

        System.out.println("Is num7 > num8 = " + isNum7GreaterNum8);

        final int num9 = 10;
        final int num10 = 20;

        boolean isNum9LessNum10 = num9 < num10;
        System.out.println("isNum9LessNum10 = " + isNum9LessNum10);

        final int num11 = 100;
        final int num12 = 100;
        System.out.println((num11 >= num12));
        System.out.println((num11 <= num12));
        System.out.println((num11 == num12));
        System.out.println((num11 != num12));

        String name = "Elsayed";
        System.out.println("(name instanceof String) = " + ((Integer) num11 instanceof Object));

        boolean isStateSucceed = (num11 >= num12) || (num9 > num10);
        System.out.println("isStateSucceed = " + isStateSucceed);

        System.out.println("----------------------------------------");

        // Assignment Operation
        int num13 = 10 + 1;
        num13 += 3;

        System.out.println("num13 = " + num13);

        num13 -= 4;
        System.out.println("num13 = " + num13);

        num13 *= 10;
        System.out.println("num13 = " + num13);

        num13 /= 10;
        System.out.println("num13 = " + num13);

        // Bitwise Operation

        int num14 = 11;  // 00001011
        int num15 = 3;   // 00000011
        System.out.println(num14 & num15); // 00000011
        System.out.println(num14 | num15); // 00001011
        System.out.println(num14 ^ num15); // 00001000

        System.out.println("----------------------------------------");

        // Ternary Operation
        final String fullName = "Amr Bedery";

        final char state = "aMr beDery Abdelaziz".equalsIgnoreCase(fullName) ? 'y' : 'n';

        System.out.println("state = " + state);
    }
}
