//19. Given an array Arr, of N integers find the sum of max(A[i], A[j]) for all i, j such that i < j.
//    input
//    4
//    5 3 3 1
//    output : 24
package Arrays;
import java.util.*;
public class arrays19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        long sum=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            sum += arr[n-1] * (n-1);
            n--;
        }
        System.out.println(sum);
    }
}
