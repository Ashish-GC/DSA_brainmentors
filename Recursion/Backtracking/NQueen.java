class NQueen{
        static boolean QueenSafe(boolean board[][],int row,int col){
        //   upper row
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        // right diagnol
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
             if(board[i][j]){
                return false;
            }
        }
        // left diagonal
         for(int i=row,j=col;i>=0 && j>=0;i--,j--){
             if(board[i][j]){
                return false;
            }
        }
         return true;
        }
    static int count(boolean board[][],int row){
       int c=0;
       if(board.length==row){
        return 1;
       }
        for(int column=0;column<board[row].length;column++){
            if(QueenSafe(board,row,column)){
                   board[row][column]=true;

                 int result= count(board,row+1);
                 c=c+result;
                 board[row][column]=false;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int n=4;
        boolean board[][]=new boolean[n][n];
       int result= count(board,0);
       System.out.println(result);
    }
}