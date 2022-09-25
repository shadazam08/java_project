package SortingS;
import java.util.*;
public class mergeSort {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void merge(int[] arr, int start, int mid, int last){
        int[] merged = new int[last - start + 1];
        int index1 = start;
        int index2 = mid+1;
        int x = 0;
        while(index1<=mid && index2 <=last){
            if(arr[index1] <= arr[index2]){
                merged[x++] = arr[index1++];
            }else{
                merged[x++] = arr[index2++];
            }
        }
        while(index1<=mid){
            merged[x++] = arr[index1++];
        }
        while (index2<=last){
            merged[x++] = arr[index2++];
        }
        for(int i=0,j=start; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void sort(int[] arr, int start, int last){
        if(start >= last) {
            return;
        }
            int mid = start + (last - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid+1, last);
            merge(arr, start, mid, last);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int arr[] = {7,8,2,3,1};
//        int n = arr.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr, 0, n-1);
        printArray(arr);
    }
}