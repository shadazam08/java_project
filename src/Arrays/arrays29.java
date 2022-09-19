/**29. Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array. The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
    Input:
    N = 4
    A[] = {8,3,1,2}
    Output: 29
   Explanation: Above the configuration
    possible by rotating elements are
    3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
    1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
    2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
    8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
    Here the max sum is 29 */
package Arrays;
import java.util.*;
public class arrays29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0, f_sum=0, solv=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            f_sum += i * arr[i];
        }
        for(int i=0; i<n; i++){
//            sum += arr[i];
//            f_sum += i * arr[i];
            f_sum = f_sum - (sum-arr[i]) + ((n-1)* arr[i]);
            solv = Math.max(f_sum, solv);
        }
        System.out.println(solv);
    }
}
