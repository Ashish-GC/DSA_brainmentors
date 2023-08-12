import java.util.ArrayList;
import java.util.List;

public class leetcode54 {

    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        ArrayList<Integer> spiral = new ArrayList<>();
          
          int row=matrix.length;
          int col=matrix[0].length;

          int top=0;      int bottom=row-1;
          int left=0;      int right=col-1;

        while(top<=bottom && left<=right){
              
               for(int i=left;i<=right;i++){
                      spiral.add(matrix[top][i]);
               }
                top++;

                for(int i=top;i<=bottom;i++){
                    spiral.add(matrix[i][right]);
                }
                right--;
                 
                if(top<=bottom){
                 for(int i=right;i>=left;i--){
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
                }
                
               if(left<=right){
               for(int i=bottom;i>=top;i--){
                    spiral.add(matrix[i][left]);
                }
                left++;
               }

        }
         System.out.print(spiral);

    }
}


