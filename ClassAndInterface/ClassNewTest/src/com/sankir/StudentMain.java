package com.sankir;

public class StudentMain {

    public static void main(String[] args) {

        Student st1 = new Student();

        st1.setRollno(1);
        st1.setName("Kiran");
        st1.setMarks(95);

        System.out.println(st1);
        System.out.println(st1.getMarks());
        System.out.println(st1.value);
        System.out.println("After st1 creation : " + Student.objCount);

        Student st2 = new Student(2, "Sanajay", 85);

        System.out.println(st2);
        System.out.println(st2.getMarks());
        System.out.println(st2.value);
        System.out.println("After st2 creation : " + Student.objCount);
        //System.out.println("After st2 creation 2thru st: " + st2.objCount);

//    st2.objCount = 200; // NOT correct
//    System.out.println("After changing :" + Student.objCount);

        System.out.println("Max students :" + Student.maxstudents);

        Student.maxstudents += 10;

        System.out.println("Max students :" + Student.maxstudents);

        Student st3 = new Student(3, "Rajesh", 86);
        Student st4 = new Student(4, "Raman", 50);
        Student st5 = new Student(5, "Santosh", 65);

        System.out.println("No of students now : " + Student.objCount);

        // Initialise student array;
        Student[] studentslist = new Student[]{st1, st2, st3, st4, st5};

        //   Student[] studentslist = new Student[5];
//    studentslist[0] = st1;
//    studentslist[1] = st2;
//    studentslist[2] = st3;
//    studentslist[3] = st4;
//    studentslist[4] = st5;
//

        System.out.println();
        for (Student stval : studentslist)
            System.out.println(stval);

        System.out.println();
        for (Student stval : studentslist) {
            if(stval.getName().charAt(0) == 'S')
                System.out.println(stval);

        }
    }
}
