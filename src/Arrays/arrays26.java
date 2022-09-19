//26. Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.
package Arrays;
import java.util.*;
public class arrays26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int count = 0;
        for(int i=0; i<=n-1; i++){
            if(arr[i] == X){
                count++;
            }
        }
        System.out.println(count);
    }
}
