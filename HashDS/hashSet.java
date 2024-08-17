import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(1); //Not allow to duplicate
    System.out.println(set.size());
    set.remove(1);
    System.out.println(set.size());

    if(set.contains(2)){
        System.out.println("2 is present in set.");
    }
    if(!set.contains(1)){
        System.out.println("Yes ,1 in not present in set.");
    }
    
    //You can print all set element.
    System.out.println(set);

    //For iteration
    // we have .next() and .hasNext()
    Iterator<Integer> it = set.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());   
    }
  }    
}
