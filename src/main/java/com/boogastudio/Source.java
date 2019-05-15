package com.boogastudio;

public class Source {
    private String baeldung;
    private int i;
    private double age;
    private double name;

    public Source(String baeldung, int i) {

        this.baeldung = baeldung;
        this.i = i;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }
}
