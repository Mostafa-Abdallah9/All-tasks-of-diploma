package com.pioneers.$07oop.$03inheritance;

import java.util.Objects;

public class Singer extends Person {
    private final String gender;

    public Singer(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public void sing(String songName) {
        System.out.println(this.getName() + " is singing...... 🎤🎤🎤🎤🎤🎤🎤🎤🎤🎤🎤" + songName);
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Singer singer)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(gender, singer.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gender);
    }

    @Override
    public String toString() {
        return "Singer{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
