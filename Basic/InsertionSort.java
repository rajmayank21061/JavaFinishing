import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9,3,1,8,7};
        int len = arr.length-1;
        for(int i =0;i<len;i++){
            int current = arr[i];
            int k;
            while( k>=0 && current < arr[k]){
              arr[k+1] =arr[k];
              k--;
            }
            arr[j+1] =  current;
        }
        void printarr (int p =0; p<arr.length ; p++){
            System.out.print(" " + arr[p]);
        }
    }
}
