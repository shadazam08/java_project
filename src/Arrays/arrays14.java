//14. Design a function void print() with a single dimensional array x[] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double-digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
package Arrays;
import java.util.*;
public class arrays14 {
    static void print(int[] arr, int n){
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<=n-1; i++){
            if(arr[i]>0 && arr[i]<=9){
                sum1 += arr[i];
            } else if (arr[i]>=10 && arr[i]<=99) {
                sum2 += arr[i];
            }
        }
        System.out.println("Single Element Of Sum = " + sum1);
        System.out.println("double Element Of Sum = " + sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of element");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        print(arr, n);
    }
}
