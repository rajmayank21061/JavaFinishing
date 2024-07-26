import java.util.*;

public class GCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcd = 1; // Initialize GCD to 1
        int smaller = Math.min(n1, n2);

        for (int i = 2; i <= smaller; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD is : " + gcd);
    }
}
