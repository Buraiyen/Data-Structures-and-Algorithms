package algo.linearsearch;

import java.util.Scanner;
import java.util.Random;


public class LinearDriver {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        int size, min, max, value, index;
        int [] arr;

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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(min, max);
        }
        index = search(arr, value);
        if (index == -1) {
            System.out.println("Value not in list");
        }
        else {
            System.out.println("Value of index: " + index);
        }

    }

    /**
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

    public static int random(int min, int max) {
        return RANDOM.nextInt(max) + min;
    }
}
