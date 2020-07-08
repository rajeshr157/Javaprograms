package com.sankir;

public class PermutationsTest {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};

        AllPermutation perm = new AllPermutation(arr);

        perm.getFirst();

        while (perm.hasNext())
        {
            perm.getNext();
        }
        System.out.println(AllPermutation.count);
    }
}
