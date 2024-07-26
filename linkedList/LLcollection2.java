import java.util.Collections;
import java.util.ArrayList;

public class LLcollection2 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(43);
    numList.add(32);
    numList.add(0);
    numList.add(2);
    numList.add(80);
    numList.add(129);
    for(int i : numList){
        System.out.println(i);
    }
    Collections.sort(numList,Collections.reverseOrder());
    for(int i : numList){
        System.out.println(i);
    }
    }
}
