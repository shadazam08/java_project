package Searching;
import java.util.Scanner;
public class BinarySearch {
    static int binarySearch(int[] arr, int x){
        int low = 0, high = arr.length-1;
        while(low <= high){
//            Calculate Mid
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+ result);
    }
}

//1,2,2,3,3,3,4,4,4,4,5
//1=1
//2=2
//3=3
//4=4
//5=1
