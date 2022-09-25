package Arrays.twoDArrays;
import java.util.*;
public class addTwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] arr1 = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        int[][] arr2 = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                arr2[i][j]= arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
