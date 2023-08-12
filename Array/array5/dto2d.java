class dto2d {
    static int[][] construct2DArray(int[] original, int m, int n) {
        int matrix[][]=new int[m][n];
        int row=0;
        int col=0;
            if(n*m != original.length){
                return new int [0][0];
            }
        for(int i=0;i<original.length;i++){  
                  if(col==n){
                      col=0;
                      row++;
                  }     
        matrix[row][col]=original[i] ;            
             col++;
        }
           return matrix;
    }
    public static void main(String[] args) {

 int arr[]={1,2,3,4}; int m,n=2;
       int result[][]= construct2DArray(arr,2,2);
        

       
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
   
