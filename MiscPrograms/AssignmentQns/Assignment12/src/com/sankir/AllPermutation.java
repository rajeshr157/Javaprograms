package com.sankir;

public class AllPermutation {

    // The input array for permutation
    private final int arr[];

    // Index array to store indexes of input array
    private int indexes[];

    // The index of the first "increase"
    // in the Index array which is the smallest
    // i such that Indexes[i] < Indexes[i + 1]
    private int increase;

    static int count = 0;

    public AllPermutation(int arr[]) {
        this.arr = arr;
        this.increase = -1;
        this.indexes = new int[this.arr.length];
    }

    // Initialize and output
    // the first permutation
    public void getFirst() {

        // Allocate memory for Indexes array
        this.indexes = new int[this.arr.length];

        // Initialize the values in Index array
        // from 0 to n - 1
        for (int i = 0; i < indexes.length; ++i) {
            this.indexes[i] = i;
        }

        // Set the Increase to 0
        // since Indexes[0] = 0 < Indexes[1] = 1
        increase = 0;

        // Output the first permutation
        this.output();
    }

    public boolean hasNext() {

        // When Increase is in the end of the array,
        // it is not possible to have next one
        return this.increase != (this.indexes.length - 1);
    }

    // Output the next permutation
    public void getNext() {

        // Increase is at the very beginning
        if (this.increase == 0) {

            // Swap Index[0] and Index[1]
            this.Swap(this.increase, this.increase + 1);

            // Update Increase
            this.increase += 1;
            while (this.increase < this.indexes.length - 1
                    && this.indexes[this.increase]
                    > this.indexes[this.increase + 1]) {
                ++this.increase;
            }
        } else {

            // Value at Indexes[Increase + 1] is greater than Indexes[0]
            // no need for binary search,
            // just swap Indexes[Increase + 1] and Indexes[0]
            if (this.indexes[this.increase + 1] > this.indexes[0]) {
                this.Swap(this.increase + 1, 0);
            } else {

                // Binary search to find the greatest value
                // which is less than Indexes[Increase + 1]
                int start = 0;
                int end = this.increase;
                int mid = (start + end) / 2;
                int tVal = this.indexes[this.increase + 1];
                while (!(this.indexes[mid] < tVal && this.indexes[mid - 1] > tVal)) {
                    if (this.indexes[mid] < tVal) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                    mid = (start + end) / 2;
                }

                // Swap
                this.Swap(this.increase + 1, mid);
            }

            // Invert 0 to Increase
            for (int i = 0; i <= this.increase / 2; ++i) {
                this.Swap(i, this.increase - i);
            }

            // Reset Increase
            this.increase = 0;
        }
        this.output();
    }

    // Function to output the input array
    private void output() {
        for (int i = 0; i < this.indexes.length; ++i) {

            // Indexes of the input array
            // are at the Indexes array
            System.out.print(this.arr[this.indexes[i]]);
            System.out.print(" ");
        }
        System.out.println();
        count++;
    }

    // Swap two values in the Indexes array
    private void Swap(int p, int q) {
        int tmp = this.indexes[p];
        this.indexes[p] = this.indexes[q];
        this.indexes[q] = tmp;
    }
}

