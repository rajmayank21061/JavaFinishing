import java.util.*;
public class Stringmethods2 {
    public static void concat1(String str){
        str = str + "Hey";
    }
    public static void concat2(StringBuilder str){
       str.append("Hey");
    }
    public static void concat3(StringBuffer str){
        str.append("Hey");
    }
    public static void main(String[] args) {
        String str = "Hello_";
        concat1(str);
        System.out.println(str);
        StringBuilder str2 = new StringBuilder("Hello_");
        concat2(str2);
        System.out.println(str2);
      /* StringBuffer str3 = new StringBuffer("Hello_");
        concat3(str3);
        System.out.print(str3);*/ 
        // String Methods
        str2.charAt(3);
        System.out.println(str2);
        str2.setCharAt(0, 'J');
        System.out.println(str2);
        str2.insert(2, 'F');
        System.out.println(str2);
        str2.delete(0, 6);
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);
    }
}
