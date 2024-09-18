import java.util.ArrayList;
import java.util.List;
public class NQueensProb {
    //2
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal(for left right)
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical(for up down)
        for(int i =0; i<board.length; i++){
            if(board[i][ col] == 'Q'){
                return false;
            }
        }
        //diagnal checking
        //upper left
        int r = row;
        for(int c = col; c>=0 && r>=0 ; c--,r++){
        if(board[r][c] == 'Q'){
            return false;
        }
        }
        // upper right
        r = row;
        for(int c = col; c<board.length && r>=0; c++,r--){
        if(board[r][c] == 'Q'){
            return false;
        }
        }
        //lower left
        r = row;
        for(int c= col; c>=0 && r<board.length; r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        
        for(int c= col; c>=0 && r<board.length; r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    //3
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i =0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q')
                row += 'Q';
                else
                row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    //1
    public void helper(char[][] board, List<List<String>> allBoards,int col){
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }   
        for(int row = 0; row<board.length; row++){
            if(isSafe(row,col,board)){
               board[row][col] = 'Q';
               helper(board, allBoards, col + 1);
               board[row][col] = '.'; 
            }
        }
    }
            
    public static void main(String args[])
    {
      
        NQueensProb Queen = new NQueensProb();
       
       
    }
}
