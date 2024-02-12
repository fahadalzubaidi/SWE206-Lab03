public class Sorter {
    public static void main(String[] args) {
        int[] arr1 = {9, 5, 1, 4, 3};
        int[] arr2 = {7, 2, 6, 0, 8};
        insertionSort(arr1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort(arr2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted at the correct position
            int j = i - 1; // Index of the previous element

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the element at its correct position
        }
    }
        public static void selectionSort ( int[] arr){
            int n = arr.length;

            // One by one, move the boundary of the unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in the unsorted subarray
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }