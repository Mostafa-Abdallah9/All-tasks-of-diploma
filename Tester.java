package com.pioneers.$07oop.$03inheritance;

public class Tester extends Employee {

    public Tester(String name, int age, String email, String company, float salary) {
        super(name, age,  email, company, salary);
    }

    public void findBug() {
        System.out.println(this.getName() + " found the bug");
    }

    public void study(final String topic) {
        System.out.println(this.getName() + " is studying " + topic + "....");
    }

    @Override
    public String toString() {
        return "Tester{"
                + "name = '" + this.getName() + '\'' +
                "}";
    }
}
