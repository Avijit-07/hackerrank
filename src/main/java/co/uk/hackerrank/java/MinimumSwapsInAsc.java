package co.uk.hackerrank.java;

public class MinimumSwapsInAsc {

    static int minimumSwaps(int[] arr) {
        int length = arr.length;
        int i = arr.length;
        int k = 0;
        int temp;
        int count = 0;
        while (k < length && i - k >=0) {
            if (arr[k] != i - k) {
                temp = arr[k];
                arr[k] = arr[temp + k];
                arr[temp + k] = temp;
                count++;
            } else {
                i--;
                k++;
                continue;
            }
            k++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[] { 3, 2, 1, 4 }));
    }
}
