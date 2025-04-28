import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();

        // Contoh input array
        int[] array = {5, 2, 8, 1, 9};

        // Misalnya kita ingin melakukan 2 iterasi
        int maxIterations = 2;

        // Panggil bubbleSort
        int[] sortedArray = bSort.bubbleSort(array.clone(), maxIterations); // pakai clone supaya array aslinya tidak rusak

        // Print hasil setelah sorting
        System.out.println("Array setelah " + maxIterations + " iterasi:");
        System.out.println(Arrays.toString(sortedArray));
    }
}
