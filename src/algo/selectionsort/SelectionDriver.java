package algo.selectionsort;

import java.util.Arrays;

public class SelectionDriver {
    public static void main(String[] args) {
        int [] arr = selectionSort(new int[] {1, 43, 10, 9, 82, 22, 1193});
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Selection sort first searches through the entire array and finds the smallest integer. It then
     * swaps that integer with the first index of the array; that index is now considered the smallest in the array.
     * The algorithm then moves on to the next index and searches through the entire array for the next smallest
     * integer. The process repeats until the array is sorted. O(n^2)
     *
     * @param arr - array to be sorted
     * @return - sorted array
     */
    public static int [] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) { // if a new smallest integer is found
                    min = j;
                }
            }
            // swap the smallest integer with the first available index
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
