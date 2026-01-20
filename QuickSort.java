package dsa.sorting;

public class QuickSort {

   
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
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

        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.print("Original array: ");
        display(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
