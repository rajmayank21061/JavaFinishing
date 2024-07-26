public class E2program {
    //factorial
    public static int factorial(int h){
     //base case
     if(h==0 || h==1){
        return 1;
     }
    return h * factorial(h-1);
    }
    //fibonacci series
    public static void fibonacci(int a,int b, int n){
        if( n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b,c,n-1);

    }
    //power of x
    //Should be stack height n
    public static int powerfind(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //return x * powerfind(x, n-1);
        //for stack height logn
        if(n%2==0){//for even x^2 * x ^2;
            int x1 = powerfind(x, n/2) * powerfind(x, n/2);
            return x1;
        }
        else{ //for odd x^2 * x^2 * x;
            int x2 = powerfind(x, n/2) * powerfind(x, n/2);
            return x2 * x;
        }
    }
    public static void main(String[] args) {
       /* int ans = factorial(5);
        System.out.println(ans);
        //fibonacci
        int a =0;
        int b =1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a, b, n-2);    */
        int value = powerfind(5, 3);
        System.out.println(value);
    }
}
