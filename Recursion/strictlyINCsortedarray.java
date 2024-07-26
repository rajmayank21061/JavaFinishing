public class strictlyINCsortedarray {
    public static boolean isSorted(int arr[],int ind){
    int len = arr.length-1;
    if(arr[ind] != arr[ind+1] && ind == len){
            return true;
    }
    if(arr[ind] >= arr[ind+1]){
        return false;
    }
    isSorted(arr,ind+1);
}
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5,6};
        isSorted(arr1, 0);
    }
}
public class sortedArray {
    public static boolean isSorted(int arr[], int ind) {
        if (ind == arr.length - 1) { // Base case: reached