package Star_Pattern;
import java.util.*;
public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // outer Loop
        for(int i = 1; i <= n; i++){
            // inner loop
            for(int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
