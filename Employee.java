package com.pioneers.$07oop.$03inheritance;

import java.util.Objects;

public class Employee extends Person {
    private final String email;
    private final String company;
    private float salary;

    public Employee(String name, int age, String email, String company, float salary) {
        super(name, age);
        this.email = email;
        this.company = company;
        this.salary = salary;
    }

    public float increaseSalary(final float percentage) {
        this.salary += (this.salary * percentage);
        return this.salary;
    }

    public float decreaseSalary(final float percentage) {
        this.salary -= (this.salary * percentage);
        return this.salary;
    }

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(salary, employee.salary) == 0
                && Objects.equals(email, employee.email)
                && Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, company, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
