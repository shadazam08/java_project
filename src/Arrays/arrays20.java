//20. Given an array of length N in which you can swap two elements if their sum is odd i.e for every i (1 to N) and j (1 to N) if (Arr[i] + Arr[j]) is odd then you can swap these elements.
//    What is the lexicographically smallest array you can obtain?
//    Sample Input:-
//    3
//    4 1 7
//    Sample Output:-
//    1 4 7
package Arrays;
import java.util.*;
public class arrays20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for(int i=0; i<=n-1; i++){
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        if(even>0 && odd>0){
            Arrays.sort(arr);
        }
        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
