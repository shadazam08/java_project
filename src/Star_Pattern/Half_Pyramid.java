package Star_Pattern;
import java.util.*;
public class Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
