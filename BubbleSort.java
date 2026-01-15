package dsa.sorting;

public class BubbleSort {

    
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

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

        int[] arr = {5, 1, 4, 2, 8};

        System.out.print("Original array: ");
        display(arr);

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
