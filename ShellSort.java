public class ShellSort {

    public int[] shellSort(int[] arr, int maxIterations) {
        if (arr == null || arr.length <= 1 || maxIterations <= 0) {
            return arr;
        }

        int n = arr.length;
        int gap = n / 2;
        int iterations = 0;

        while (gap > 0 && iterations < maxIterations) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;

                iterations++;
                if (iterations >= maxIterations) {
                    break; // Jika sudah mencapai maxIterations, keluar dari loop
                }
            }
            gap /= 2;
        }

        return arr;
    }
}
