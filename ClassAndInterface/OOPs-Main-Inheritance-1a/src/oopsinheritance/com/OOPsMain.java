package oopsinheritance.com;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*

Yes, it is possible for two Strings to have the same hashcode -
If you take a look at the Wikipedia article, you will see that both "FB" and "Ea" have the same hashcode.
There is nothing in the method contract saying a hashCode() should be used to compare for equality,
you want to use equals() for that

 */
public class OOPsMain {

    public static void main(String ... args) {

        // Initialize and print BTech class object
        // obj count incremented when object is created with constructor/new
        BTech bs1 = new BTech(1, "Rohith", 90);
        System.out.println("Number of BTech Objects  after bs1 : " + BTech.bTechobjCount);
        System.out.println(bs1);
        System.out.println("Timer value in superclass: " + bs1.timer);

        // Print BTech class names
        System.out.println();
        String name11 = bs1.getClass().getSimpleName();
        System.out.println("BTech class name with package : " + name11);
        String name12 = bs1.getClass().getSimpleName();
        System.out.println("BTech class name : " + name12);
        String name13 = bs1.getClass().getSuperclass().getSimpleName();
        System.out.println("superclass of BTech : " + name13);

        // Initialize and print MTech class object
        System.out.println();
        MTech ms1 = new MTech(12, "Kiran", 91, 5, "Computers");
        System.out.println("Number of BTech Objects after ms1 : " + BTech.bTechobjCount);
        System.out.println("Number of MTech Objects after ms1 : " + MTech.mTechobjCount);
        System.out.println(ms1);
        System.out.println("Timer value in subclass: " + ms1.timer);
        System.out.println("Timer value in superclass: " + ms1.supertimer());

        // Print MTech class names
        System.out.println();
        String name21 = ms1.getClass().getName();
        System.out.println("MTech class name with package : " + name21);
        String name22 = ms1.getClass().getSimpleName();
        System.out.println("MTech class name : " + name22);
        String name23 = ms1.getClass().getSuperclass().getSimpleName();
        System.out.println("superclass of MTech : " + name23);


        System.out.println();
        System.out.println("Ploymorphism - Method overloading - Overriding ");
        System.out.println("Display Of BTech : " + bs1.display("SanKir"));
        System.out.println("Display of MTech : " + ms1.display("SanKir"));

        // obj count incremented
        BTech bs2 = new BTech();
        MTech ms2 = new MTech();  // executes BTech() by default

        System.out.println();
        System.out.println("Number of BTech Objects after bs2 : " + BTech.bTechobjCount);
        System.out.println("Number of MTech Objects after ms2 : " + MTech.mTechobjCount);

        // Just by assignement objcount is not incremented
        BTech bs3 = bs1;
        MTech ms3 = ms1;

        System.out.println();
        System.out.println("Number of BTech Objects after bs3 : " + BTech.bTechobjCount);
        System.out.println("Number of MTech Objects after ms3 : " + MTech.mTechobjCount);

    }
}
