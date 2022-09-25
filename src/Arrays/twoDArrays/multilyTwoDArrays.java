package Arrays.twoDArrays;
import java.util.*;
public class multilyTwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] total = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                total[i][j] = 0;
                for(int k=0; k<n; k++){
                    total[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(total[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
