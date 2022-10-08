/*
* int[] arr = {7,10,15,14,5,9,35,40};
*
* */
package ArenaQuestion;

import Searching.BinarySearch;

public class binarySearchAndMergeShort {
    public static void printArray(int[] arr){
        System.out.println("Sorted Arrays");
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void sort(int[] arr, int start, int mid, int end){
        int[] merged = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int x = 0;
        while(index1 <= mid && index2 <= end){
            if(arr[index1] <= arr[index2]){
                merged[x++] = arr[index1++];
            }else{
                merged[x++] = arr[index2++];
            }
        }
        while (index1 <= mid){
            merged[x++] = arr[index1++];
        }
        while (index2 <= end){
            merged[x++] = arr[index2++];
        }
        for(int i=0, j=start; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void mergeShort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low) / 2;
        mergeShort(arr, low, mid);
        mergeShort(arr, mid+1, high);
        sort(arr, low, mid, high);
    }
    public static int binarySearch(int[] arr, int x){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                low = mid+1;
            }else{
                low = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,10,15,14,5,9,35,40};
        int x = 35;
        int n = arr.length;
        mergeShort(arr, 0, n-1);
        printArray(arr);
        System.out.println("\nSearch in Sorted Array using Binary Search");
        int result = binarySearch(arr,x);
        if(result == -1){
            System.out.println(x + " Not Found in array");
        }else{
            System.out.println(x + " Found in array  " + result);
        }
    }
}
