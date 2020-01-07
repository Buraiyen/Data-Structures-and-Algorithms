package algo.binarysearch;

public class BinarySearchDriver {

    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == x) return middle;
            if (arr[middle] > x) right = middle - 1;
            if (arr[middle] < x) left = middle + 1;
        }
        return -1;
    }
}
