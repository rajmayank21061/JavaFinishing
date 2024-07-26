import java.util.*;
public class Stringmethods {
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("first_name : ");
   String fn = sc.next();
   System.out.print("last_name : ");
   String ln = sc.next();
   System.out.print("full_name : ");
   //String full_n = fn +" "+ ln ;
   String full_n = fn.concat(" "+ ln);
   System.out.print(full_n);
   System.out.println();
   if(fn.compareTo(ln) == 0){ // n1 = n2 in String bcs is wrong
    System.out.print("Fist name is eaual to Last name.");
   } 
   else{
    System.out.print("Not equal.");
   }
//    if(new String("hello")== new String("hello")){
//     System.out.print("Equal.");
//    } 
//    else{
//     System.out.print("Not equal.");
//    }
System.out.println();
String yourWord = full_n.substring(0,full_n.length());
System.out.println(yourWord);
}

}