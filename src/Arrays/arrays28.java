//28. Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
//Constraints:
//1 <= N <= 10^5
//1 <= Ai <=10^12

package Arrays;
import java.util.*;
public class arrays28 {
    static void getMinMax(long[] arr, int n){
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i=0; i<=n-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min + " "+ max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextLong();
        }
        getMinMax(arr,n);
    }
}
