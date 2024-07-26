public class towerofHanoi {//s:source,h:helper,d:destination
        public static void tofHanoi(int n,String s,String h,String d){
        if(n==1){
        System.out.println("Transfer disk " + n +" from " + s + " to " + d );
        return;
               }
        tofHanoi(n-1, s, d, h);
        System.out.println("Transfer disk " + n +" from " + s + " to " + d );
        tofHanoi(n-1, h, s, d);
            }
        public static void main(String args[]){
            tofHanoi(4, "S","H","D");  

        }    
}
