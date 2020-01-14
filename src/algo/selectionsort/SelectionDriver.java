package algo.selectionsort;

import java.util.Arrays;

public class SelectionDriver {
    public static void main(String[] args) {
        int [] arr = selectionSort(new int[] {1, 43, 10, 9, 82, 22, 1193});
        System.out.println(Arrays.toString(arr));
    }

    public static int [] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
