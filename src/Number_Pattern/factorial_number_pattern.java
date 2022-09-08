package Number_Pattern;
import java.util.*;
public class factorial_number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int count = i * 6;
            for(int j=1; j <= n; j++){

                System.out.print(count + " ");
                count += 4;
            }
            System.out.println();
        }
    }
}
