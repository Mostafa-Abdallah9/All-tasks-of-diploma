package com.pioneers.$07oop.$01class;

class Student {
    // blocks

    {
        System.out.println("I am in the non-static block");
    }

    static {
        System.out.println("I am in the static block");
        academicName = "Tech Pioneers Hub - Updated";
    }

    // fields (attributes)     --> characteristics
    public static String academicName = "Tech Pioneers Hub";

    String name;
    int age;
    String email;
    String address;

    // constructors            --> building the object(s)
    // Empty Constructor or default constructor or no args constructor
    Student() {
        System.out.println("I am in the empty constructor");
    }

    Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Student(String name, int age) {
        System.out.println("I am in the constructor with 2 parameters");
        this.name = name;
        this.age = age;
    }

    // methods                 --> behaviors (actions)
    static void sleep(String name) {
        System.out.println(name  + " is 🛌🛌🛌🛌🛌🛌🛌🛌");
    }

    void eat() {
        System.out.println("🥣🥣🍔🍔🍔🍔🍔🍔🍔");
    }

    void drink() {
        System.out.println("🧃??☕☕☕☕☕☕☕");
    }

    void walk() {
        System.out.println("🚶🏻🚶‍♂️🚶‍♂️🚶‍♂️🚶‍♂️🚶‍♂️🚶‍♂️🚶‍♂️");
    }

    void setName(final String name) {
        this.name = name;
    }

    void setAge(final int age) {
        this.age = age;
    }

    void setEmail(final String email) {
        this.email = email;
    }

    void setAddress(final String address) {
        this.address = address;
    }


    // inner classes or interfaces
}
