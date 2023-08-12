public class RatinaMaze2 {

     static boolean checkpath(int maze[][],int row,int col){
        if(row<maze[row].length && col<maze.length && maze[row][col]==1 && row>=0 && col>=0){
            return true;
        }
        return false;
    }

    static boolean mazePath(int maze[][],int row,int col,int result[][]){
           if(row==maze.length-1 && col==maze.length-1){
            result[row][col]=1;
            return true;
           }
           if(checkpath(maze,row,col)){
                result[row][col]=1;

               if(mazePath(maze, row+1, col, result)) {
                 return true;
               }

                if(mazePath(maze, row, col+1, result)){
                     return true;
                }
                
                // undo
                result[row][col]=0;
           }
             return false;

    }
    

    public static void main(String[] args) {
         int maze[][] = {{ 1, 0, 1, 0, 1 },
                         { 1, 1, 1, 1, 1 },
                         { 0, 1, 0, 1, 0 },
                         { 1, 0, 0, 1, 1 },
                         { 1, 1, 1, 0, 1 } };

        int result[][]=new int [maze.length][maze.length];

              mazePath(maze,0,0,result);
        
        for(int i=0;i<result.length;i++){
                for(int j=0;j<result.length;j++){
                     System.out.print(result[i][j]+" ");
                 }
                  System.out.println();
        }
    }
}
