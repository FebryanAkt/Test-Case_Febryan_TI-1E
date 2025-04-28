public class InsertionSort {

    public int[] insertionSort(int[] arr, int maxIterations) {
        if (arr == null || arr.length <= 1 || maxIterations <= 0) {
            return arr;
        }

        int n = arr.length;
        int iterations = 0;

        for (int i = 1; i < n && iterations < maxIterations; i++) {
            int key = arr[i];
            int j = i - 1;

            // Geser elemen array yang lebih besar dari key ke kanan
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            iterations++;
        }

        return arr;
    }
}
