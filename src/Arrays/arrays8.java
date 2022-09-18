//8.  Write a program which takes in 10 values and creates another array which has cubes of the values and prints it.
package Arrays;
import java.util.*;
public class arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        int[] cube = new int[n];
        for(int i=0; i<=n-1; i++){
            cube[i] = arr[i] * arr[i] * arr[i];
            System.out.print(cube[i] + " ");
        }
    }
}
