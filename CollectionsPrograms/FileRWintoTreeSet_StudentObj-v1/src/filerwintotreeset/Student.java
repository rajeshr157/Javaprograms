package filerwintotreeset;

import java.util.Objects;

// Student class and constructor
public class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private int age;
    private double marks;

    Student(int rollno, String name, int age, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
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
                ", age=" + age +
                ", marks=" + marks + '}' +  "\n" ;

    }

    // override comareTO method
    // helps in sorting objects
    // if the current object is less than prev then return 1, ele -1;
    // return 0 if they are equal
    public int compareTo(Student o) {

        //Sort on roll number
//        System.out.println("Inside compareTO");
//
//           if (rollno > o.rollno) {
//                return 1;
//            } else if (rollno < o.rollno) {
//                return -1;
//            } else {
//               return 0;
//           }


        // Sort on name
     //return name.compareTo(o.name);

        //Sort on Age
//       if (age > o.age) {
//            return 1;
//        } else if (age < o.age) {
//            return -1;
//        } else {
//           return 0;
//       }

        if (marks > o.marks) {
            return 1;
        } else if (marks < o.marks) {
            return -1;
        } else {
           return 0;
       }

    }

} // Class Student Ends


