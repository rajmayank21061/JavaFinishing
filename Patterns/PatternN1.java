import java.util.*;
public class PatternN1 {
    public static void main(String[] args) {
        int bio = 5;
        for(int i = 1; i<=bio; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    System.out.println();
        for(int i = 1; i<=bio; i++){
            for(int j = 1;j<= bio -i +1; j++){
                    System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        int num = 1;
        for(int i = 1; i<=bio; i++){
            
            for(int j = 1;j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();    
        }

        System.out.println();
        int bin = 1;
        for(int i = 1; i<=bio; i++){
            for(int j = 1;j<= i; j++){
                if((i+j)%2 ==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
