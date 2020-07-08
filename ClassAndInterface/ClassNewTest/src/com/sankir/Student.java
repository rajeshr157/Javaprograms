package com.sankir;

public class Student {

    static int objCount = 0;
    static int maxstudents = 120;
    // properties or Attribues
    private int rollno;
    private String name;
    private int marks;

    public int value = 50;

    // Canstructor
    // same name as Class - No return value
    public Student() {
        objCount++;
    }

    public Student(int rollno, String name, int marks) {
        objCount++;
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
