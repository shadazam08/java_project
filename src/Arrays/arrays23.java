//23.   There are N buildings in a row with different heights H[i] (1 <= i <= N).
//You are viewing the buildings from the left and you can see the roof of a building i if no building to the left of the ith building has a height greater than the ith building.
//You are asked to find the number of buildings whose roofs you can see.
package Arrays;
import java.util.*;
public class arrays23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] h = new long[n];
        for(int i=0; i<=n-1; i++){
            h[i] = sc.nextInt();
        }
        int count = 1;
        long max = h[0];
        for(int i=1; i<=n-1; i++){
            if(max < h[i]){
                count++;
                max = h[i];
            }
        }
        System.out.println(count);
    }
}
