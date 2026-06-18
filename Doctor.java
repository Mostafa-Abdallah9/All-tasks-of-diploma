package com.pioneers.$07oop.$03inheritance;

public class Doctor extends Employee {

    public Doctor(String name, int age, String email, String hospital, float salary) {
        super(name, age, email, hospital, salary);
    }

    public void examinePatient() {
        System.out.println(this.getName() + " is examining the patient......");
    }

    @Override
    public String getName() {
        return "Dr. " + super.getName();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                ", email='" + getEmail() + '\'' +
                ", hospital='" + getCompany() + '\'' +
                ", salary=******" +
                '}';
    }
}
