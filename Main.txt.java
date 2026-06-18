import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // EX 1 (While)
        int initNumber = 0;
        while (initNumber <= 10) {
            System.out.println(initNumber);
            initNumber +=2;
        }
        System.out.println("***************************************************************");
        // another solution on EX 1 (While)
//for (int initNumber = 0 ; initNumber < 10 ; initNumber = initNumber + 1) {
    while (initNumber <= 10) {
        System.out.println(initNumber);
        initNumber +=2;
    }
        System.out.println("***************************************************************");

        // EX 1 (do  While)
        int initalNumber = 0;
        do {
            System.out.println(initalNumber);
            initalNumber +=2;
        } while (initalNumber <= 10);
        System.out.println("***************************************************************");
        // another solution on EX 1 (do While)
//for (int initNumber = 0 ; initNumber < 10 ; initNumber = initNumber + 1) {
//    do {
//        System.out.println(initNumber);
//        initNumber +=2;
//    } while (initNumber <= 10);
 //Assignment (1) by using while
//        float [] numbers = {1.1f,2.1f,3.1f,4.1f,5.1f};
//        float maxmumNumber = numbers[0];
//        int i = 1;
//        while (i < numbers.length) {
//            if (numbers[i] > maxmumNumber){
//                maxmumNumber = numbers[i];
//            }
//            i+=1;
//        }
//        System.out.println(" Maximum Number In This Array Is " + maxmumNumber);
        // Assignment (1) by using do while
//        float [] numbers = {1.1f,2.1f,3.1f,4.1f,5.1f};
//        float maxmumNumber = numbers[0];
//        int i = 1;
//        do {
//            if (numbers[i] > maxmumNumber) {
//                maxmumNumber = numbers[i];
//            }
//            i+=1;
//        } while (i < numbers.length);
//        System.out.println(" Maximum Number In This Array Is " + maxmumNumber);
        // Assignment (1) by using for
//        float [] numbers = {1.1f,2.1f,3.1f,4.1f,5.1f};
//        float maxmumNumber = numbers[0];
//        for (float num : numbers) {
//        if ( num > maxmumNumber) {
//            maxmumNumber = num;
//        }
//        }
//        System.out.println(" Maximum Number In This Array Is " + maxmumNumber);
        // Assignment Ex2
//       final  String [] namesOfStudentsInExams = {"Mahmoud","Qonswa","Fatma","Menna","Saleh","Khaled","Alwakil","Abdelaziz"};
//       final float [] degreesOfStudentsInExams = {75f,40f,99f,91f,20f,49.99f,70f,80f};
//        int i = 0;
//        while (i < namesOfStudentsInExams.length) {
//            if (degreesOfStudentsInExams[i] < 50){
//              final String failedStudentsInExam = namesOfStudentsInExams[i] + " " + degreesOfStudentsInExams[i];
//                System.out.println(" Failed Students In Exam Are" + failedStudentsInExam);
//            } else {
//                final String PassedStudentsInExam = namesOfStudentsInExams[i] + " " + degreesOfStudentsInExams[i];
//                System.out.println(" Passed Students In Exam Are " + PassedStudentsInExam);
//            }
//            i++;
//        }
        // Write a Java Program to check if the number is even or odd using
        //Methods.
//acceptFromUserIntegerNumberAndCheckNumberEvenOrOddThenPrintResult();
//    public static void  acceptFromUserIntegerNumberAndCheckNumberEvenOrOddThenPrintResult(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter Your Number");
//        final Integer number = scanner.nextInt();
//        if (number%2==0){
//            System.out.println(" This Is Number Is Even " + number);
//            return;
//        }
//            System.out.println(" This Is Number Is Odd " + number);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter First Number For Sum : ");
        final int firstNumberForSum = scanner.nextInt();
        System.out.println(" Please Enter Second Number For Sum : ");
        final int secondNumberForSum = scanner.nextInt();
       final int summationResult = sum(firstNumberForSum,secondNumberForSum);
        System.out.println(" summation is = " + summationResult);
        System.out.println(" Please Enter First Number For Subtract : ");
        final int firstNumberForSubtract = scanner.nextInt();
        System.out.println(" Please Enter Second Number For Subtract : ");
        final int secondNumberForSubtract = scanner.nextInt();
       final int subtractionResult = subtract(firstNumberForSubtract,secondNumberForSubtract);
        System.out.println(" subtraction is = " + subtractionResult);
        System.out.println(" Please Enter First Number For Subtract : ");
        final int firstNumberForMultiply = scanner.nextInt();
        System.out.println(" Please Enter Second Number For Multiply : ");
        final int secondNumberForMultiply = scanner.nextInt();
       final int multiplicationResult = multiply(firstNumberForMultiply,secondNumberForMultiply);
        System.out.println(" multiplication is = " + multiplicationResult);
        System.out.println(" Please Enter First Number For Subtract : ");
        final int firstNumberForDivide = scanner.nextInt();
        System.out.println(" Please Enter Second Number For Divide : ");
        final int secondNumberForDivide = scanner.nextInt();
        final int DividionResult = divide(firstNumberForDivide,secondNumberForDivide);
        System.out.println(" dividion is = " + DividionResult);
    }
    public static int sum(final int firstNumberForSum,final int secondNumberForSum){
        return firstNumberForSum + secondNumberForSum;
    }
    public static int subtract(final int firstNumberForSubtract,final int secondNumberForSubtract){
        return firstNumberForSubtract - secondNumberForSubtract;
    }
    public static int multiply(final int firstNumberForMultiply,final int secondNumberForMultiply){
        return firstNumberForMultiply * secondNumberForMultiply;
    }
    public static int divide(final int firstNumberForDivide,final int secondNumberForDivide){
        return firstNumberForDivide / secondNumberForDivide;
    }
//    char [] letters = {'a','c','d','e','i','o','u'};
//    for (int i = 0 ; i <letters.length ; i++) {
//        char characterLetter = letters[i];
//        switch (characterLetter) {
//
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(characterLetter + " is vowel - ASCII: " + (int) characterLetter);
//                break;
//            default:
//                System.out.println(characterLetter + " is consonant - ASCII: " + (int) characterLetter);
//        }
//    }
}



