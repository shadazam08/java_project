package SortingS;

import java.util.Scanner;

public class insertionSort {
    public static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int[] arr = {7,8,2,3,1};
//        Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int sorted = arr[i];
            int j = i - 1;
            while (j >= 0 && sorted < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = sorted;
        }
        printArrays(arr);
    }
}
