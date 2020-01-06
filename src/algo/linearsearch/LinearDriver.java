package algo.linearsearch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;



public class LinearDriver {

    private static final Random RANDOM = new Random();

    /**
     * @author - Brian Nguyen
     * @date - 1/6/20
     */
    public static void main(String[] args) {
        int size, min, max, value, index;
        int [] arr;
        long start, end, timeElapsed;

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

        start = System.nanoTime();
        populateArray(arr, min, max);
        end = System.nanoTime();

        timeElapsed = end - start;

        index = search(arr, value);

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
     * Linear searching algorithm. O(n)
     *
     * @param arr - the array used to search for integer
     * @param x - the value that the array is searching for
     * @return - the index where the value is found. -1 if not found
     */
    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
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
