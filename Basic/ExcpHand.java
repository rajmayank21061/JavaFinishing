import java.util.*;
public class ExcpHand {
    public static void main(String[] args) {
        //ArithmeticException
        int a = 0,b=9;
        int c;
       try{
        // c = b/a;
        c = a + b;
        System.out.println(c);
       }
       catch( ArithmeticException dee){
        System.out.println(dee);
        System.out.print("The code is executed");
       }
       // NullPointerException:
       //String key = null;
       String key = "bheema";
       try{
        System.out.println(key.toUpperCase());
       }
       catch( NullPointerException z){
        System.out.println("Yes there is a exception.");
        System.out.println(z);
       }
    }
}
