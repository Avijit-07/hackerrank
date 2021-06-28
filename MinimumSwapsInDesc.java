package com.avijit.practice.test;

public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {
        int length = arr.length;
        int i = 0;
        int temp;
        int count = 0;
        while (i < length) {
            if (arr[i] != i + 1) {
                temp = arr[i]; //7
                arr[i] = arr[temp - 1]; //6
                arr[temp - 1] = temp; //7
                count++;
            } else {
                i++;
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[] { 7, 1, 3, 2, 4, 5, 6 }));
    }
}
