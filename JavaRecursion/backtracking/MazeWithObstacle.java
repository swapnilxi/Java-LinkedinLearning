package backtracking;
//find all possible path
public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] board={{ true, true, true},
        {true, false, true},
        {true, true , true}};
possiblePath("", board, 0, 0);
    }

static void possiblePath(String p, boolean[][] board, int i, int j) {
    int m= board.length-1;
    int n= board[0].length-1;
   if(board[i][j]==false){
   return;
    }
    if(i==m&& j==n){
        System.out.println(p);
        return;
     }
    if(board[i][j]==false){
        return; 
    }
   //down 
   if(i<m){
   possiblePath("D"+p, board, i+1,j);
}
   //right 
   if(j<m){
    possiblePath("R"+p, board, i,j+1);
 }
   
    }
    
}

