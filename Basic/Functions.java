import java.util.*;
public class Functions {
    public static int summition(int a,int b){
        int sum = a + b;
        System.out.print("The Sum is : "+ sum);
        return sum;
    }
    public static int factorial(int a){
       if(a<0){
        System.out.print("Invalid number.");
        return -1;
       }
        int temp = 1;
        for(int i = 0;i<a;i++){
            temp *= a-i;
        }
        return temp;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wrire a value of a ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Write a value of b ");
        int b = sc.nextInt();
     
     summition(a, b);
     System.out.println();
     System.out.print("Enter a factorial,you want : ");
     int c = sc.nextInt();
     System.out.print("The factorial is : " + factorial(c));
    }
}
