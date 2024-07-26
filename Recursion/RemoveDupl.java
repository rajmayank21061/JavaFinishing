import java.util.*;
public class RemoveDupl {
    public static boolean [] map = new boolean[26];
    public static void removeDupl(String str,int i,String newStr){
      char current = str.charAt(i);
      if(i==str.length()){
        System.out.println(newStr);
        return;
      }
      if(map[current - 'a']){
        removeDupl(str, i+1,newStr);
      }
      else{
        newStr += current;
        map[current - 'a'] = true;
        removeDupl(str, i+1,newStr);
      }
    }
    //public static void removeDupl2(String str, int j){
    //StringBuilder str2 = new StringBuilder();
    // for(j =0; j<str.length(); j++){
    //   char ch = str.charAt(j);
    //   int idx = str.indexOf(ch,j+1);
    //   if(idx == -1){
    //     str2.append(ch);
    //   }
    // }
    // System.out.println(str2);
    //}
    public static void removeDupl3(String str){
    StringBuilder str3 = new StringBuilder();
    char[] arr = str.toCharArray();
   for(int m =0; m<arr.length; m++){
    boolean repeated = false;
    for(int n =0; n<m+1; n++){
      if( arr[m] == arr[n]){
        repeated = true;
        break;
      }
    }
    if(!repeated){
      str3.append(arr[m]);  }
   }
   System.out.println(str3);
    }
    public static void main(String[] args) {
    removeDupl3("abaacbbda");
    }
}