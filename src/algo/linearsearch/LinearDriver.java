package algo.linearsearch;

import java.util.Scanner;
import java.util.Random;


public class LinearDriver {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        int size, min, max, value;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        size = in.nextInt();

        System.out.print("Enter the minimum value of the range greater than zero: ");
        min = in.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        min = in.nextInt();

        System.out.print("Enter the value you would like to search for: ");
        value = in.nextInt();


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
