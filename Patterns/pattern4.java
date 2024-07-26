import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        int bio = 5;
        for (int i = 1; i <= bio; i++) {
            for (int j = 1; j <= bio; j++) {
                int temp = 1;
                if (i == j || (i + j == bio + 1) ) {
                    System.out.print("* ");
            }
                 else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
