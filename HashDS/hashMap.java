import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Abhay");
        map.put(23, "Manvendra");
        map.put(24, "Mayank");
        map.put(28, "Nitish");

        map.put(23, "Raj");

        //for Iterate
        //for( int a : arr);
        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getValue() + e.getKey());
        }
        //Second method we print keys
       /* Set<Integer> keys = map.keySet();
        for( int key : keys){
            System.out.println(key + " " + map.get(key));
        }
             */
            map.remove(23);
            System.out.println(map);
    }
}
