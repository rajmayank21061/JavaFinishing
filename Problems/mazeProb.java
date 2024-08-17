public class mazeProb {
    public static void main(String args[]){
        //System.out.println(count(0 , 0, 4, 4));
        printPath("", 3, 3);

    }
    static int count(int r , int c,int m, int n){
        if (r == m || c == n) {
            return 0;
            
        } 
        if(r == m-1 && c == n-1){
            return 1;
        }
       //move right
       int right = count(r,c+1,m,n);
       //move down
       int down = count(r+1,c,m,n);
       return right + down;
    }
    static void printPath(String str, int r, int c) {
        // Base case: If we have reached the bottom-right corner
        if (r == 1 && c == 1) {
            System.out.println(str);
            return;
        }
        // If we can move right (c > 0)
        if (c > 1) {
            printPath(str + 'R', r, c - 1);
        }
        // If we can move down (r > 0)
        if (r > 1) {
            printPath(str + 'D', r - 1, c);
        }
    }
    
}
