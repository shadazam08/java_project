//27. An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exist).
//    Given an array arr[] of size N, Return the index of any one of its peak elements.
//    Note: The generated output will always be 1 if the index that you return is correct. Otherwise, output will be 0.
package Arrays;
import java.util.*;
public class arrays27 {
    static int peakElement(int[] arr, int n){
        int count = 0;
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                count++;
                return count;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        if(peakElement(arr, n) == 1) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
