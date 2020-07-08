package oopsinheritance.com;

import java.util.Objects;

/**
 *
 */

// every class is a child of  - Object - class
public class BTech {

    // static memebers to be accessed by Class itself rather than class instance
    // static member is at Class level ad local variable is at Object level

    static int bTechobjCount =0;  // at class level
    public int timer =50;    // object evel

    private int rollno;
    private String name;
    private int marks;

    public BTech() {
        bTechobjCount++;
    }

    public BTech(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        bTechobjCount++;
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



    public String display(String s){

        return s.toLowerCase(); // return lowercase
    }

    @Override
    public String toString() {
        return "BTech{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


}
