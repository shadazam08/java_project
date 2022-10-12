package SortingS;

public class quickSort {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSorts(int[] arr, int low, int high)
    {
        if (low >= high) {
            return;
        }
            int pi = partition(arr, low, high);
            quickSorts(arr, low, pi - 1);
            quickSorts(arr, pi + 1, high);
    }
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        quickSorts(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
