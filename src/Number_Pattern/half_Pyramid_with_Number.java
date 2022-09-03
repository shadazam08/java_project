package Number_Pattern;
import java.util.*;
public class half_Pyramid_with_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
