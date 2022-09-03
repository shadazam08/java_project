package Star_Pattern;
import java.util.*;
public class Inverted_half_pyramid_rotated_by_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            // inner loop
            for(int k = 1; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
