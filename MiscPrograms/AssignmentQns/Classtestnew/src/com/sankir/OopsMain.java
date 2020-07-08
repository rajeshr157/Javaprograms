package com.sankir;

public class OopsMain {
    public static void main(String[] args) {

        Btech bs1 = new Btech(1, 56, "Rajesh");
        System.out.println("Number of Btech objects after bs1: " + Btech.btechcount);
        System.out.println(bs1);
        System.out.println("Timer value in superclass:" + bs1.timer);

        System.out.println();
        String name1 = bs1.getClass().getName();
        System.out.println("Btech class name with package is: " + name1);
        String name2 = bs1.getClass().getSimpleName();
        System.out.println("Btech class name: " + name2);
        String name3 = bs1.getClass().getSuperclass().getSimpleName();
        System.out.println("Superclass of Btech is: " + name3);

        Mtech ms1 = new Mtech(1, 56, "Rajesh", 1, "Mechanical");

        System.out.println();
        System.out.println("Number of Btech objects after ms1: " + Btech.btechcount);
        System.out.println("Number of Mtech objects after ms1: " + Mtech.mtechcount);
        System.out.println(ms1);
        System.out.println("Timer value in subclass:" + ms1.timer);
        System.out.println("Timer value in superclass:" + ms1.supertimer());


        System.out.println();
        String name21 = ms1.getClass().getName();
        System.out.println("Mtech class name with package is: " + name21);
        String name22 = ms1.getClass().getSimpleName();
        System.out.println("Mtech class name: " + name22);
        String name23 = ms1.getClass().getSuperclass().getSimpleName();
        System.out.println("Superclass of Mtech is: " + name23);

        System.out.println();
        System.out.println("Polymorphism -Method overloading - overriding");
        System.out.println("Display of BTech : "+ bs1.display("Sankir"));
        System.out.println("Display of Mtech :"+ ms1.display("Sankir"));

    }
}
