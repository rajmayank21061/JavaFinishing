import java.util.HashSet;
import java.util.Iterator;

public class problem3 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,1,3,2};
        int[] arr2 = {1,9,8,7,3};
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0; i<arr2.length; i++){
        if (set1.contains(arr2[i])) {
            System.out.print(arr2[i] + " ");
            count++;
            set1.remove(arr2[i]);
        }
    }
    System.out.println();
    System.out.print(count);
    }
}
