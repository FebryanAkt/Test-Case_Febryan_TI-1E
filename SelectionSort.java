public class SelectionSort {

    public int[] selectionSort(int[] arr, int maxIterations) {
        if (arr == null || arr.length <= 1 || maxIterations <= 0) {
            return arr;
        }

        int n = arr.length;
        int iterations = 0;

        for (int i = 0; i < n - 1 && iterations < maxIterations; i++) {
            int minIndex = i;

            // Cari elemen terkecil dari sisa array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar elemen minimum dengan elemen pertama
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            iterations++;
        }

        return arr;
    }
}
