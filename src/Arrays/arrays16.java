//16. Initialize a one dimension array with first nine natural numbers and then display in the following format.
//    1       2       3
//    4       5       6
//    7       8       9
package Arrays;
import java.util.*;
public class arrays16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int k=0;
        for(int i=0; i<(n/3); i++){
            for(int j=k; j<k+3; j++){
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
            k +=3;
        }
    }
}
