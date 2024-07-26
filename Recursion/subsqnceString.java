// for unique set of string
import java.util.*;
//ex aaa; Unique Subs :a,aa,aaa.  and only Subs : aaa,aa,aa,aa,a,a,a, ,. 
public class subsqnceString {
    public static void SubSequenceString(String str,int idx ,String str2,HashSet<String> set){
          if(idx == str.length()){
            if(set.contains(str2)){
              return;
            }
            else{
            System.out.println(str2);
            set.add(str2);
            return;
            }
          }
        char cuurent = str.charAt(idx);
        //charater aana chahta hai
        SubSequenceString(str, idx + 1, str2+cuurent,set);
        //character aana nhi chahta hai
        SubSequenceString(str,  idx + 1, str2,set);
    }
    public static void main(String args[]){
      HashSet<String> set = new HashSet<>();
        SubSequenceString("aaa", 0, "",set);
    }
}
