package algo.binarysearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchDriver {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int size, min, max, value, index;
        int [] arr;
        long start, end, timeElapsed;

        BubbleSort bs = new BubbleSort();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        size = in.nextInt();

        System.out.print("Enter the minimum value of the range (zero or greater): ");
        min = in.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        max = in.nextInt();

        System.out.print("Enter the value you would like to search for: ");
        value = in.nextInt();

        arr = new int[size];

        populateArray(arr, min, max);

        bs.bubbleSort(arr);

        start = System.nanoTime();
        index = binarySearch(arr, value);
        end = System.nanoTime();

        timeElapsed = end - start;


        if (index == -1) {
            System.out.println("Value not in list");
        }
        else {
            System.out.println("Value of index: " + index);
        }
        System.out.println("Time elapsed: " + timeElapsed + " ns");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Binary search algorithm. The algorithm divides the sorted array in half depending on the middle
     * value of the array and the value being searched for. O(log n).
     *
     * @param arr - array to be used for searching
     * @param x - value that is being searched for
     * @return - the index position of the value being searched. -1 if not found
     */
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == x) return middle;
            if (arr[middle] > x) right = middle - 1; // Cuts off the right half of the array
            if (arr[middle] < x) left = middle + 1; // Cuts off the left half of the array
        }
        return -1;
    }

    /**
     * Method used to populate an array with random integers specified by the min and max constraints
     *
     * @param arr - the array to be populated
     * @param min - minimum integer value
     * @param max - maximum integer value
     * @return - populated array
     */
    public static void populateArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(min, max);
        }
    }

    /**
     * Generates a random integer specified by the range constraints
     *
     * @param min - minimum value
     * @param max - maximum value
     * @return - random integer specified by range constraints
     */
    public static int random(int min, int max) {
        return RANDOM.nextInt(max) + min;
    }
}
