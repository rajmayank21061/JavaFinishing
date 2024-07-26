import java.util.*;
public class keypadcomb {
public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void print_combn(String str,int idx,String combination){
    if(idx == str.length()){
        System.out.println(combination);
        return;
    }
    char curr_char = str.charAt(idx);
    String mapping = keypad[curr_char - 'a'];
    for(int i=0;i<mapping.length(); i++){
        print_combn(str, idx+1, combination + mapping.charAt(i));
    }
}
public static void main(String[] args) {
    String str = "23";
    print_combn(str, 0, "");
}
}
