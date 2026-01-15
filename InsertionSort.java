package dsa.sorting;

public class InsertionSort {

   
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.print("After pass " + i + ": ");
            display(arr);
        }
    }

   
    public static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

   
    public static void main(String[] args) {

        int[] arr = {9, 5, 1, 4, 3};

        System.out.print("Original array: ");
        display(arr);

        insertionSort(arr);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
