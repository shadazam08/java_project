/*
A=7,10,15,14
B=5,9,35,40
* */
package SortingS;

public class mergeTwoArray {
    static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
    static void sortArray(int[] arr, int[] arr1,int[] finalArray, int n, int m){
        int i=0, j=0, l=0;
        while(i < n){
            finalArray[l++] = arr[i++];
        }
        while (j < m){
            finalArray[l++] = arr1[j++];
        }
        sort(finalArray);
    }
    public static void main(String[] args) {
        int[] arr = {7,10,15,14};
        int[] arr1 = {5,9,35,40};
        int n = arr.length;
        int m = arr1.length;
        int[] finalArray = new int[n + m];
        sortArray(arr, arr1, finalArray, n, m);
        for(int i=0; i<n+m; i++){
            System.out.print(finalArray[i] + " ");
        }
    }
}