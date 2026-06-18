package io.encapsulation;

import java.util.Objects;

public class Student2 {
    private final String name;
    private final float degree;

    public Student2(String name, float degree) {
        this.name = name;
        this.degree = degree;
    }

    public void showStudentDegree() {
        if (degree <= 50) {
            System.out.println(name + "This Student Failed With This Degree" + degree);
            return;
        }
        System.out.println(name + " : This Student Will Be Passed With This Degree : " + degree);

    }

    public String getName() {
        return name;
    }

    public float getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", degree=" + degree +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student2 student2 = (Student2) o;
//        return Float.compare(degree, student2.degree) == 0 && Objects.equals(name, student2.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, degree);
    }
}
