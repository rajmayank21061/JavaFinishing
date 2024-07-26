import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ArrayList1 {
        public static void main( String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(4);
        int ele = list.get(2);
        System.out.println(ele);
        list.add(3,9);
        list.remove(2);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        //looping itereation
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //sorting 
        Collections.sort(list);

        System.out.println(list);
    }
}
