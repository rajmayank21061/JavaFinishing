import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
    StringBuilder word = new StringBuilder("Boops");
    // for(int i = word.length() - 1; i>=0; i--){
    //  System.out.print(word.charAt(i));
    // }
    int i =0;
    int j = word.length()-1;
    while (i < j) {
        char frontChar = word.charAt(i);
        char backChar = word.charAt(j);
        word.setCharAt(i, backChar);
        word.setCharAt(j, frontChar);
        i++;
        j--;
    }    
    System.out.print(word);
}
}
