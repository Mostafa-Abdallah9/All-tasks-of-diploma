package com.pioneers.$07oop.$03inheritance;

import java.util.Objects;

public class Developer extends Employee {

    private final String programmingLanguage;

    public Developer(String name, int age, String email, String company, float salary, String programmingLanguage) {
        super(name, age, email, company, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void fixDefect(final String defectNumber) {
        System.out.println("Developer " + this.getName() + " is fixing defect number: " + defectNumber + ".....");
        System.out.println("Successfully fixed the defect!!");
    }

    public void study(final String topic) {
        System.out.println(this.getName() + " is studying " + topic + "....");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Developer developer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(programmingLanguage, developer.programmingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLanguage);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
