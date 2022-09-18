//24. Given an array of N elements, your task is to find the count of repeated elements. Print the repeated elements in ascending order along with their frequency.
//    Have a look at the example for more understanding.
//    5
//    3 2 1 1 2
//    Sample Output:-
//    1 2
//    2 2
package Arrays;
import java.util.*;
public class arrays24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            for(int j=i+1; j< n; j++){
                if(arr[i] == arr[j]){

                    System.out.println(arr[i]+ " "+ arr[j]);
                }
            }
        }
    }
}
