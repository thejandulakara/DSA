package dsa.sorting;

public class OptimizedQuickSort {

   
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    
    public static int partition(int[] arr, int low, int high) {

        int mid = (low + high) / 2;
        int pivot = arr[mid];

        // move pivot to end
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        System.out.print("Pivot " + pivot + ": ");
        display(arr);

        return i + 1;
    }

    
    public static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

   
    public static void main(String[] args) {

        int[] arr = {12, 7, 14, 9, 10, 11};

        System.out.print("Original array: ");
        display(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
