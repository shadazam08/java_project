package ArenaQuestion;

public class averageWithoutLoop {
        // Recursively computes average of a[]
        static double avgCalcRec(int[] a, int i, int n)
        {
            // Last element
            if (i == n-1)
                return a[i];

            // When index is 0, divide sum computed so
            // far by n.
            if (i == 0)
                return ((a[i] + avgCalcRec(a, i+1, n))/n);

            // Compute sum
            return (a[i] + avgCalcRec(a, i+1, n));
        }

        // Function that returns the average of an array.
        static double averageCalculate(int[] a, int n)
        {
            return avgCalcRec(a, 0, n);
        }
        //driver code
        public static void main (String[] args)
        {
            int[] arr = {10,9,7,8,5,3,2,1,11,14,6,8};
            int n = arr.length;
            double avg=averageCalculate(arr, n);
            System.out.println(avg);
        }
    }
