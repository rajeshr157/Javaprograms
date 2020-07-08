package com.sankir;

public class Parent {

    public static void main(String[] args) {

        StudentNew s1 = new StudentNew();

        s1.setRoll(1);
        s1.setName("Ram");
        s1.setMarks(90);

        StudentNew s2 = new StudentNew(2, "Raj", 85);
        StudentNew s3 = new StudentNew(3, "Ankith", 70);
        StudentNew s4 = new StudentNew(4, "Suresh", 40);
        StudentNew s5 = new StudentNew(5, "Hareesh", 60);
        StudentNew s6 = new StudentNew(6, "Kiran", 95);

        StudentNew.studentnum +=6;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(StudentNew.s7);
        System.out.println(StudentNew.s8);
        System.out.println(StudentNew.s9);
        System.out.println(StudentNew.s10);
        System.out.println(StudentNew.s11);


        System.out.println(StudentNew.objCount);
        System.out.println(StudentNew.studentnum);
    }
}
