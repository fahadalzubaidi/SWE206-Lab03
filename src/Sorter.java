public class Sorter {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        selectionSort(arr);

    }
    public static void selectionSort(int[] arr) {
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
    // Method 'sort' to act as a convenient interface
    public static void sort(int[] array) {
        selectionSort(array);
    }
}
