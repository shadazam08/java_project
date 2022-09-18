//21. Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
//    Given N-1 elements your task is to find the missing one.
//    Sample Input:-
//    3
//    3 1
//    Sample Output:
//    2
package Arrays;
import java.util.*;
public class arrays21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Element N-1");
        for(int i=0; i<=n-2; i++){
            arr[i] = sc.nextInt();
        }
        int sumOfAll = (n * (n + 1)) / 2;
        int sumOfArrays = 0;
        for(int i=0; i<=n-2; i++){
            sumOfArrays += arr[i];
        }
        int missing = sumOfAll - sumOfArrays;
        System.out.println(missing);
    }
}