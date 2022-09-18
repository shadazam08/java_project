//15. write a program to generate and store the 20 term of Fibonacci series in an array.
//    fibArr [20]: 0,1,1,2,3,5,8,13,21,34,…
//    Finally print the sum of all element contained in fibArr [20]
package Arrays;
import java.util.*;
public class arrays15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<=n-1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        long sum = 0;
        for(int i=0; i<=n-1; i++){
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Fibonacci Sum = " + sum);
    }
}
