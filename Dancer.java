package com.pioneers.$07oop.$03inheritance;

import java.util.Objects;

public class Dancer extends Person {
    private final float weight;

    public Dancer(String name, int age, float weight) {
        super(name, age);
        this.weight = weight;
    }

    public void dance() {
        System.out.println(this.getName() + " is dancing 💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻💃🏻");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dancer dancer)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(weight, dancer.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "weight=" + weight +
                '}';
    }
}
