import java.util.ArrayList;

public class subsetIntegers {
    
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }
    public static void subsetofIntegers(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        //if add
        subset.add(n);
        subsetofIntegers(n-1, subset);

        //if no add
        subset.remove(subset.size() -1);
        subsetofIntegers(n-1, subset);
    }
    public static void main(String args[]){
        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        subsetofIntegers(n,subset);
    }
}
