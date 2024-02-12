public class Sorter {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        insertionSort(arr);
        for (int num : arr) {
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
}