package com.sankir;

public class ThirdMaxNumber {
    public static void main(String[] args) {

        int[] input = {1,9,9,9,9,9,9,1};
        int[] copy = input;
        int count = 0;

        while (count < input.length) {

            for (int i = 0; i < input.length - 1; i++) {
                if (copy[i] < copy[i + 1]) {
                    int temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                }

            }
            count++;
        }

        for (int val : copy)
            System.out.print(val + " ");

        if (input.length == 2)
            System.out.println("The maximum number is: " + copy[0]);

        else {
            int firstmax = copy[0];
            int secondmax = copy[1];
            int thirdmax = secondmax;
            int n = 0;


            for (int i = 1; i < copy.length; i++) {
                if (copy[i] != firstmax) {
                    secondmax = copy[i];
                    thirdmax=secondmax;
                    n = i;
                    break;
                }
            }
            for (int i = n; i < copy.length; i++) {
                if (copy[i] != secondmax) {
                    thirdmax = copy[i];
                    break;

                }
            }

            if (thirdmax == secondmax) {
                System.out.println();

                System.out.println("Third maximum doesn't exist. The maximum number is: "+firstmax);
            }
            else{
                System.out.println();

                System.out.println("Third maximum exists and it is: "+thirdmax);
                System.out.println(firstmax);
                System.out.println(secondmax);
                System.out.println(thirdmax);
            }


        }
    }
}

