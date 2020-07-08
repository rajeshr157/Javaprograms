package com.sankir;

public class StudentNew {

    private int roll;
    private String name;
    private int marks;

    static int objCount = 0;
    static int studentnum = 100;

    static StudentNew s7 = new StudentNew(7, "Jitin", 85);
    static StudentNew s8 = new StudentNew(8, "Jishnu", 99);
    static StudentNew s9 = new StudentNew(9, "Roshan", 35);
    static StudentNew s10 = new StudentNew(10, "Andrew", 51);
    static StudentNew s11 = new StudentNew(11, "Amal", 77);


    public StudentNew() {
        objCount++;
    }

    public StudentNew(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        objCount++;

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
