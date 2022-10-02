package MockTestQuestion;
import java.util.Scanner;
public class NationalFlagProblem {
    static void sortedArray(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int temp = 0;
        while(mid <= high){
            switch(arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
        printArray(arr,arr.length);
    }
    static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortedArray(arr);
//        0 1 1 0 1 2 1 2 0 0 0 1
    }
}
