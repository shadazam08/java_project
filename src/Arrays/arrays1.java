// 1.  Write a program that creates integer array of N elements, accepts values of arrays and then displays the values.
package Arrays;
import java.util.*;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
