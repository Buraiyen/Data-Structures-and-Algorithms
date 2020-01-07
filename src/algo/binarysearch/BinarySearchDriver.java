package algo.binarysearch;

public class BinarySearchDriver {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(binarySearch(arr, 5));
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
}
