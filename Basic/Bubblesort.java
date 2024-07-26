import java.util.*;
public class Bubblesort {
public static void print_array(int arr[]){
    for(int i=0; i<arr.length; i++)
    System.out.print(arr[i] + " ");
  }
    public static void main( String args[]){
    int arr[] = {4,5,1,53,9,2};
    int len = arr.length -1;
    for(int i =0; i<len; i++){
        for(int j=0; j<len-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    print_array(arr);
    }
}