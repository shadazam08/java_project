//25.   Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
package Arrays;
import java.util.*;
public class arrays25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        int[] temp = new int[n];
        for(int i=0; i<=n-1; i++){
            if(arr[i]>=0){
                temp[j++] = arr[i];
            }
        }
        for(int i=0; i<=n-1; i++){
            if(arr[i]<0){
                temp[j++] = arr[i];
            }
        }
        for(int i=0; i<=n-1; i++){
            arr[i] = temp[i];
            System.out.print(arr[i] + " ");
        }

    }
}
