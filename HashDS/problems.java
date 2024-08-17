import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class problems {

//Find itenerary from tickets
public static String startPath(HashMap<String,String> map){   
   HashMap<String,String> map2 = new HashMap<>();
   for( String key : map.keySet()){
    map2.put(map.get(key), key);
   }
   for(String key1 : map.keySet()){
        if( !map2.containsKey(key1)){
            return key1;
        }
    }
    return "";
}

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Delhi","Mumbai");
        map.put("Kerla","Up");
        map.put("Mumbai", "Haryana");
        map.put("Haryana","Kerla");
        String start = startPath(map);
                while(map.containsKey(start)){
                    System.out.print(start + " -> ");
                    start = map.get(start);
                }
                System.out.print(start);
       }
}
