//11. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
package Arrays;
import java.util.*;
public class arrays11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<=n-1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
