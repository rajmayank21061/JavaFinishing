
public class skipChar {
    static int i = 0;
    public static void skipCharFn(String str,String un){
        if(str.length() == 0){
            System.out.println(un);
            return;
        }
        char ch = str.charAt(i);
         if (ch == 'a') {
            skipCharFn(str.substring(i+1), un);
         }
         else{
          skipCharFn(str.substring(i+1),un + ch);  
         }
    }
public static void main(String[] args) {
    String str = "aabcdebbf";
    skipCharFn(str,"");
    
}
    
}