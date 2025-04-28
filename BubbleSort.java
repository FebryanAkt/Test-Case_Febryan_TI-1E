public class BubbleSort {

    public int[] bubbleSort(int[] arr, int maxIterations) {
        if (arr == null || arr.length <= 1 || maxIterations <= 0) {
            return arr;
        }
        
        int n = arr.length;
        int iterations = 0;
        
        for (int i = 0; i < n - 1 && iterations < maxIterations; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            iterations++;
            if (!swapped) {
                break;
            }
        }
        
        return arr;
    }
}
