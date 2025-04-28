import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    private static int iterationCount;
    private static List<int[]> processTrace;

    public static int[] quickSort(int[] arr, int iterationLimit, String pivotType) {
        iterationCount = 0;
        processTrace = new ArrayList<>(); // untuk menyimpan semua proses
        int[] result = arr.clone(); // Supaya array input asli tidak berubah
        quickSortHelper(result, 0, result.length - 1, iterationLimit, pivotType);

        // Cetak semua proses
        System.out.println("Trace of QuickSort:");
        for (int i = 0; i < processTrace.size(); i++) {
            System.out.println("Step " + (i + 1) + ": " + Arrays.toString(processTrace.get(i)));
        }
        return result;
    }

    private static void quickSortHelper(int[] arr, int low, int high, int iterationLimit, String pivotType) {
        if (low < high && iterationCount < iterationLimit) {
            int pi = partition(arr, low, high, pivotType);
            iterationCount++;

            // Simpan state array setelah setiap partition
            processTrace.add(arr.clone());

            quickSortHelper(arr, low, pi - 1, iterationLimit, pivotType);
            quickSortHelper(arr, pi + 1, high, iterationLimit, pivotType);
        }
    }

    private static int partition(int[] arr, int low, int high, String pivotType) {
        int pivotIndex = switch (pivotType.toLowerCase()) {
            case "first" -> low;
            case "middle" -> low + (high - low) / 2;
            case "last" -> high;
            default -> throw new IllegalArgumentException("Invalid pivot type: " + pivotType);
        };

        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high); // Pindahkan pivot ke akhir sementara

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // Pindahkan pivot ke tempat yang benar
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}