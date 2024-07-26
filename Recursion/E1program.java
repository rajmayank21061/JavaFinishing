public class E1program {
    //print number 1 to 5;
    public static void print(int i){
        if(i==0){
            return;
        } 
            System.out.println(i);
            print(i-1);
        }
        //sum of natural numbers
        public static int sum =0;//Static variable to store the sum
        public static void sumfn(int j){
            int i = j;
            if(i==0){
                System.out.println(sum);
                return;
            }
            sum +=i;
            sumfn(i-1);
        }
    public static void main(String[] args) {
        print(5);
        sumfn(5);
    }
}