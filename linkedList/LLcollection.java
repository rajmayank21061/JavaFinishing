import java.util.Collections;
import java.util.LinkedList;
public class LLcollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.addLast("c");
        list.addFirst("-a");
        list.addLast("d");
        for(int i =0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        
        list.remove(0);
        list.remove(list.size()-1);
        list.removeLast();

    for(int i =0; i < list.size(); i++){
        System.out.print(list.get(i) + " -> ");
    }
    System.out.println("null");

}
    
}
