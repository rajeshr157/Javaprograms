package com.sankir;

public class Btech {
    static int btechcount = 0;
    public int timer = 50;

    private int rollno;
    private int marks;
    private String name;

    public Btech() {
        btechcount++;
    }

    public Btech(int rollno, int marks, String name) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
        btechcount++;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String display(String s) {
        return s.toLowerCase();
    }

    @Override
    public String toString() {
        return "Btech{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
