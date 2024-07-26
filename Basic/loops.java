import java.util.*;
public class loops {
    public static void main(String[] mynk)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural number whereas you want add");
        int k = sc.nextInt();
        int sum =0;
        for(int m = 1; m < k; m++){
            sum += m;
        }
        System.out.println(sum);
        System.out.println("Enter a table number: ");
        int num = sc.nextInt();
        int n = 1;
        while (n<11) {
            System.out.println(num*n);
            n++;
        }
        do{
            System.out.println("Hello I am do");
            n++;
        }while(n < 7);
    }
}
