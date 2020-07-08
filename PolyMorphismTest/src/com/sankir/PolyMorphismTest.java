package com.sankir;

public class PolyMorphismTest {

    public static void main(String[] args) {

        int res = 0;

        res = apply(5);
        System.out.println("Apply method with int arg : sqaure " + res);

        res = apply(10, 20);
        System.out.println("apply method with Two arg : sum " + res);

        res = apply("Sankir");
        System.out.println("apply method with String arg : length " + res);

        String result = "";
        result = apply("Sankir", 'U');
        System.out.println("apply method with String and cha arg : convert " + result);
        result = apply("Sankir", 'L');
        System.out.println("apply method with String and cha arg : convert " + result);
        result = apply("Sankir", 'B');
        System.out.println("apply method with String and cha arg : convert " + result);

    }

    // 1. Method Overload - Initial signatre
    public static int apply(int n1) {
        return n1 * n1;
    }

//    public static String apply(int n1) {
//        return "true";
//    }  // thi sis invlaid

    //  2. changed param
    public static int apply(String s) {
        return s.length();
    }

    // 3. changed number of params
    public static int apply(int n1, int n2) {
        return n1 + n2;
    }


    //  4. changed no of param and return type
    public static String apply(String s, char ch) {
        if (ch == 'U')
            return s.toUpperCase();
        else if (ch == 'L')
            return s.toLowerCase();

        return "Cant convert";
    }


}  // class ends
