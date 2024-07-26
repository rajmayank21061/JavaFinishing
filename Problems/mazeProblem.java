public class mazeProblem {
    public static int countPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if( i == n-1 && j == m-1){
            return 1;
        }
        //move down
        int down = countPath(i+1, j, n, m);
        
        //move right
        int right = countPath(i, j+1, n, m);

        return down + right;
    }

    public static void main(String[] args) {
        int ans = countPath(0, 0, 3, 5);
        System.out.println(ans);
    }
}
