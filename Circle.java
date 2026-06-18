package io.encapsulation;

import java.util.Objects;

public class Circle {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double calculateArea() {
       final double result = 3.14 * radius * radius ;
       return result;
    }

    public double calculatePerimeter() {
        final double result = 2 * 3.14 * radius ;
        return result;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Float.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
