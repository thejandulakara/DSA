package dsa.sorting;

public class SelectionSort {

   
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.print("After pass " + (i + 1) + ": ");
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

        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        display(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
