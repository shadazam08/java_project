//12. Write a program to initialize a single dimensional array of N integers. Print array elements along with the indexes of each element and square of each element in three columns.
package Arrays;
import java.util.*;
public class arrays12 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            int square = arr[i] *arr [i];
            System.out.println(i+"\t"+arr[i]+"\t"+square);
        }

    }
}
