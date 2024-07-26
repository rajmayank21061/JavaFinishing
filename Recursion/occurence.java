public class occurence{
    public static int first = -1;
    public static int last = -1;
    public static void occfl(String str,int ind,char x){
        if(ind == str.length()){
            System.out.println(first + " is a first Occurence of "+ x);
            System.out.println(last + " is a last Occurence of "+ x);
            return;
        }
        if(str.charAt(ind) == x){
        if(first == -1){
            first = ind;
        }
        else{
            last = ind;
        }
        }
        occfl(str,ind+1,x);
    }
    public static void main( String args[]){
    occfl("hedfeklbb",0,'b');
    }
}