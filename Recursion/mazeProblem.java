import java.util.Arrays;

public class mazeProblem {
    static void pathRestriction(String str, boolean[][] maze,int r,int c){
    if(r == maze.length -1 && c == maze[0].length -1 ){
        System.out.println(str);
        return;
    }
    if(!maze[r][c]){  // maze[r][c] == false
        return;
    }
    if(r < maze.length -1){
        pathRestriction(str + 'D', maze, r+1, c);
    }
    if(c < maze[0].length -1){
        pathRestriction(str + 'R', maze, r, c+1);
    }            
  }
  //including all paths (left,right,top,bottom)
  static void allPaths(String str, boolean[][] maze,int r,int c){
    if(r == maze.length -1 && c == maze[0].length -1 ){
        System.out.println(str);
        return;
    }
    if(!maze[r][c]){  // maze[r][c] == false
        return;
    }
    maze[r][c] = false;

    //moving Right
    if(c < maze[0].length -1){
        allPaths(str + 'R', maze, r, c+1);
    }
    //moving Down
    if(r < maze.length -1){
        allPaths(str + 'D', maze, r+1, c);
    }
    //moving Left
    if(c > 0){
        allPaths(str + 'L', maze, r, c-1);
    }
    //moving Top
    if(r > 0){
        allPaths(str + 'T', maze, r-1, c);
    }
    maze[r][c] = true;           
    //this line where the function is over
    //so before the function gets removed,alss remove the changes that were made by the function
  }

  // print with count path
  static void allPathsCount(String str, boolean[][] maze,int r,int c,int[][] path,int step){

    if(r == maze.length -1 && c == maze[0].length -1 ){
        path[r][c] = step;
        for(int[] arr : path){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(str);
        System.out.println();
        return;
    }
    if(!maze[r][c]){  // maze[r][c] == false
        return;
    }
    maze[r][c] = false;
    path[r][c] = step;

    //moving Right
    if(c < maze[0].length -1){
        allPathsCount(str + 'R', maze, r, c+1,path,step+1);
    }
    //moving Down
    if(r < maze.length -1){
        allPathsCount(str + 'D', maze, r+1, c,path,step+1);
    }
    //moving Left
    if(c > 0){
        allPathsCount(str + 'L', maze, r, c-1 ,path,step+1);
    }
    //moving Top
    if(r > 0){
        allPathsCount(str + 'T', maze, r-1, c ,path,step+1);
    }
    maze[r][c] = true;           
  }
  public static void main(String[] args) {
    /* boolean board[][] = {
        {true,true,true},
        {true,false,true},
        {true,true,true}
    };
    pathRestriction("", board, 0, 0); */

    boolean board[][] = {
        {true,true,true},
        {true,true,true},
        {true,true,true}
    };
    //allPaths("", board, 0, 0);
    int[][] path = new int[board.length][board[0].length];
    allPathsCount("", board, 0, 0,path, 1);
  }
}
