package dsa.sorting;

public class OptimizedBubbleSort {

    
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            System.out.print("After pass " + (i + 1) + ": ");
            display(arr);

            if (!swapped) {
                break;
            }
        }
    }

    
    public static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

       public static void main(String[] args) {

        int[] arr = {3, 2, 1, 4, 5};

        System.out.print("Original array: ");
        display(arr);

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
