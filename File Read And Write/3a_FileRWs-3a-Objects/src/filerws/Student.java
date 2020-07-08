package filerws;

public class Student {
    private int rollno;
    private int age;
    private String name;
    private int marks;

    public Student() {
    }

    public Student(int rollno, int age, String name, int marks) {
        this.rollno = rollno;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

