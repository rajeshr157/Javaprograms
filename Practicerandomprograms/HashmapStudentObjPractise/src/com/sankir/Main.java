package com.sankir;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student[] ignitestudents = {new Student(1, "Ramesh", 90),
                new Student(2, "Suresh", 80),
                new Student(3, "Naresh", 95),
                new Student(4, "Kiran", 85),
                new Student(5, "Vijay", 87)};

        Student[] propelstudents = {new Student(1, "Jeeva", 75),
                new Student(2, "Krishna", 80),
                new Student(3, "Sindhu", 90),
                new Student(4, "Sanjay", 79)};

        ArrayList<Student> ignite = new ArrayList<>();
        ArrayList<Student> propel = new ArrayList<>();

        ignite.addAll(Arrays.asList(ignitestudents));
        propel.addAll(Arrays.asList(propelstudents));

        HashMap<Integer, ArrayList<Student>> hashstudents = new HashMap<>();

        hashstudents.put(11, ignite);
        hashstudents.put(255, propel);

        System.out.println();

        System.out.println("Key value pairs: ");
        hashstudents.forEach((key, val) -> {
            System.out.println("Key: " + key + " & Values: " + val);
            System.out.println();
        });

        System.out.println("Ignite students: " + hashstudents.get(11));
        System.out.println();
        System.out.println("Propel Students: " + hashstudents.get(255));

        System.out.println("Propels's second student's marks: " + hashstudents.get(255).get(1).getMarks());
        System.out.println("Ignite fourth student's name, length and third character in name: " + hashstudents.get(11).get(3).getName()+ "; " +hashstudents.get(11).get(3).getName().length() +  "; " + hashstudents.get(11).get(3).getName().charAt(2));


        Collections.sort(hashstudents.get(11), Comparator.comparingInt(Student::getMarks));
        Collections.sort(hashstudents.get(255), Comparator.comparing(Student::getName));

        System.out.println();

        System.out.println("Sorting ignite students on marks: " + hashstudents.get(11));
        System.out.println();
        System.out.println();
        System.out.println("Sortign propel students on name: " + hashstudents.get(255));
    }
}
