public class tilesPlace {
    public static int placeTiles (int n,int m){
    
        if (n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        // for vertically placing
        int verticallyPlace = placeTiles(n-m, m);

        // for horizontally placing
        int horizontallyPlace = placeTiles(n-1, m);

        return verticallyPlace + horizontallyPlace;
    }
    public static void main(String[] args) {
        int n = 4 , m = 2;
        System.out.println( placeTiles(n,m));       
    }
}