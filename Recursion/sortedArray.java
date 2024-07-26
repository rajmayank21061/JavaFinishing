public class SortedArray {
    public static boolean isSorted(int arr[], int ind) {
        int len = arr.length - 1;
        if (ind == len) {
            return true;
        }
        if (arr[ind] >= arr[ind + 1]) {
            return false; 
        }
        return isSorted(arr, ind + 1);
    }

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        boolean result = isSorted(arr1, 0);
        System.out.println("Is the array sorted? " + result);
    }
}
