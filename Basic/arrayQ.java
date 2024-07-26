import java.util.Scanner;
public class arrayQ{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        System.out.println();
        int num[] = new int[n];
        System.out.println("Enter the values ");
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the which you want to search: ");
        int found = sc.nextInt();
        for(int i =0;i<n;i++){
           if(found == num[i]){
    System.out.print("The Index of your given number is : " + i);
           }
           else{
            System.out.print("Sorry,The number is not present.");
           }
        }
    }
}