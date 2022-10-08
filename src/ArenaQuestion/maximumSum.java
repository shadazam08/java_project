/*
Maximum Sum
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Numbers are awesome, larger numbers are more awesome!

Given an array A of size N, you need to find the maximum sum that can be obtained from the elements of the array (the selected elements need not be contiguous). You may even decide to take no element to get a sum of 0.
* */
package ArenaQuestion;

import java.util.Scanner;

public class maximumSum {
    public static int getMaximumSum (int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]>0){
                sum +=arr[i];
            } else if (arr[i+1] > 0){
                i++;
            } else {
                sum += Math.max(arr[i],arr[i+1]);
                i++;
            }
        }
        if (arr[n-1] > 0){
            sum+=arr[n-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(getMaximumSum(arr, n));
    }
}
