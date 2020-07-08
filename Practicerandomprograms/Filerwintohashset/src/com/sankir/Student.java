package com.sankir;

import java.util.Objects;

public class Student {

    private int rollno;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int hashCode() {
        //return Objects.hash(getRollno());
        return Objects.hash(getName());
        //return Objects.hash(getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

//        return getRollno() == student.getRollno() &&
//                getAge() == student.getAge() &&
//                getName().equals(student.getName());

        //return getAge() == student.getAge() && getName().equals(student.getName());
        //return getAge() == student.getAge();
        return getName().equals(student.getName());
    }

}
