
package com.example;

public class ArraySum {
    public static int sum(int[] a) {
        int total = 0;
        for (int n : a) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4}));
    }
}
