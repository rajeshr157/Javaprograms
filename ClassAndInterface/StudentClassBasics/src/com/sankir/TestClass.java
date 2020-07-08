package com.sankir;

public class TestClass {

    public static void main(String[] args) {

        Student st1 = new Student();

        st1.setRollno(1);
        st1.setName("Rajesh");
        st1.setMarks(90);

        System.out.println(st1.value);
        System.out.println(st1);
        System.out.println(st1.getMarks());
        System.out.println("After st1 creation: " + Student.objCount);

        System.out.println(Student.objCount);

        Student st2 = new Student(2, "Sanjay", 85);
        System.out.println(st2);
        System.out.println(st2.getName());
        System.out.println("After st2 creation: " + Student.objCount);
        //System.out.println("After st2 creation;"+ st2.objCount);

        Student st3 = new Student(3, "Rajeev", 56);
        Student st4 = new Student(4, "Ramesh", 85);
        Student st5 = new Student(4, "Suresh", 74);
        Student st6 = new Student(6, "Anandu", 60);

        System.out.println("Total No. of students now is: " + Student.objCount);

        System.out.println("Initial Max student= " + Student.maxstudent);
        Student.maxstudent += 10;
        System.out.println("Final Max student= " + Student.maxstudent);

        //Initialize student array
        Student[] studentslist = new Student[]{st1, st2, st3, st4, st5, st6};

        System.out.println();

        for (Student stval : studentslist) {
            if ((stval.getName().charAt(0)) == 'R')
            System.out.println(stval);
        }
    }
}