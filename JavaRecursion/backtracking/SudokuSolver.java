public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board= new int[][]

{{"5","3","0","0","7","0","0","0","0"}
,{"6","0","0","1","9","5","0","0","0"}
,{"0","9","8","0","0","0","0","6","0"}
,{"8","0","0","0","6","0","0","0","3"}
,{"4","0","0","8","0","3","0","0","1"}
,{"7","0","0","0","2","0","0","0","6"}
,{"0","6","0","0","0","0","2","8","0"}
,{"0","0","0","4","1","9","0","0","5"}
,{"0","0","0","0","8","0","0","7","9"}};
if(solve(board)){
    display(board);
}else{
    System.out.println("This cannot be solved" );
}
        
        
    }
    static boolean solve(int[][] board){
        int n= board.length;
        int row =-1;
        int col=-1;

        boolean emptyLeft=true;
        for(int i= row; i<board.length; ++i){
            for(int j= col; j<board[0].length; ++j){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
        //if you find some empty element in row then break 
        if(emptyLeft==false){
            break;
        }
    }
        if(emptyLeft==true){
            return true; 
            //sudoku is solved
        }
    //backtrack 
    for(int number=0; number<9; number++){
        if(isSafe(board, col, row, number)){
            board[row][col] number;
            if(solve(board)){
                //found the answer
                display(board);
                return true;
            }else{
                //backtrack to empty space 
                board[row][col]=0;
            }
        }
    }

return false;
    }


    private static void display(int[][] board) {
        for (int[] row: board){
            for(int num:row){
                System.out.println(num+ " ");
            }
            System.out.println("");
        }
    }
    static boolean isSafe(int[][] board, int col, int row, int num){
        //check for the row 
        for (int i = 0; i < board.length; ++i) {
            // check if the number is in the row or not
            if (board[row][col] == num) {
                return false;
            }
        
        // check for the col
        for (int j = 0; j < board[0].length; ++j) {
            // check if the number is in the col or not
            if (board[i][col] == num) {
                return false;
            }
        }
    }

    //in each subgrid 
    int sqrt= (int)Math.sqrt(board.length);
    int rowStart= row-row%sqrt;
    int colStart= col-col%sqrt;

    for(int r= rowStart; r<rowStart+sqrt;r++){
        for(int c=colStart; c<colStart; c++){
            if(board[r][c]==nums){
                return false;
            }
        }

    }
    return true;
    }//isSafe
    
}
