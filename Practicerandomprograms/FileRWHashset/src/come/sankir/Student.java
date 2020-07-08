package come.sankir;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int rollno;
    private String name;
    private double marks;

    public Student() {
    }

    public Student(int rollno, String name, double marks) {
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
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

    @Override
    public int hashCode() {
        //return Objects.hash(getRollno());
        return Objects.hash(getName());
        //return Objects.hash(getMarks());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

        //return getRollno() == student.getRollno();

        return getName().equals(student.getName());

//        return Double.compare(student.getMarks(), getMarks()) == 0;
//
//        return getRollno() == student.getRollno() &&
//                Double.compare(student.getMarks(), getMarks()) == 0 &&
//                getName().equals(student.getName());
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

