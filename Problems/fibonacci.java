public class fibonacci {
    public static void Answer(int n){
         int a = 0;
        int b = 1;
        System.out.print("The Fibonacci is: " + a +" "+ b+ " " );
        for(int i = 2; i<=n; i++){
           int c = a +b;
           System.out.print(" " + c);
           a = b;
           b = c;
        }
    }
    public static void main(String[] args) {
        Answer(8);
    }
}
