public class bitManupl2 {
    int toggle(int val,int k){
           int bit_mask = 1 << k;
           return (val ^ bit_mask);
    }
public static void main(String args[]){
//5 => 0101
bitManupl2 object = new bitManupl2();
int n = 5,k=2;
System.out.println(object.toggle(n,k));

}   
}