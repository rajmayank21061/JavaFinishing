import java.util.*;
public class tooDarrayQ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the columns : ");
        int c = sc.nextInt();
        int martrix[][] = new int[r][c]; 
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                martrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    System.out.print("Enter the number which you want to search : ");
        int found = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(martrix[i][j]==found){
                    System.out.print("The coordinates is : "+ i + j);
                }
            }
        }
    
    }
}
