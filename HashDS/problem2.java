// union of two arrays

import java.util.HashSet;
import java.util.Iterator;

public class problem2 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,1,3,2};
        int[] arr2 = {1,9,8,7,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i =0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
    }
}
