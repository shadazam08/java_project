package Number_Pattern;
import java.util.*;
public class Inverted_half_pyramid_with_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
