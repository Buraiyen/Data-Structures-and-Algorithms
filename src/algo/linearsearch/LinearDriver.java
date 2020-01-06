package algo.linearsearch;

public class LinearDriver {
    public static void main(String[] args) {
        int arr[] = {111111111, 3, 2, 100, 39, 232, 11, 3344, 32, 11, 94, 298, 193, 11, 332, 1111111, 22, 333333, 4};
        System.out.println(search(arr, 4));
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
}
