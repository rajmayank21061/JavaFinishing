//Given the Integer array of size n,find all elements that apears
//more than n/3 times.
import java.util.HashMap;
import java.util.Map;
public class problem1 {


    public static void main(String[] args) {
        int nums[] = {1,3,3,3,3 ,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
    /*    for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }  */
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3 ){
                System.out.println(entry.getKey());
            }
        }
        
    }
    
}
