public class SequentialSearch {

    public int[] sequentialSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, 0}; // Tidak ditemukan, 0 langkah
        }

        int steps = 0;

        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                return new int[]{i, steps}; // Ditemukan: index, steps
            }
        }

        return new int[]{-1, steps}; // Tidak ditemukan: -1, total steps
    }
}
