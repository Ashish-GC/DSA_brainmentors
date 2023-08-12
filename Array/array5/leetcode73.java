class leetcode73 {
   public static void main(String[] args) {
     int matrix[][]={
                     {0,1,2,0},{3,4,5,2},{1,3,1,5}
     };

    int col[]=new int [matrix[0].length];
    int row[]=new int[matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               
                if(matrix[i][j]==0){
                     col[j]=1;
                     row[i]=1;
                }
                
            }
        }

               for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                    if(col[j]==1 || row[i]==1){
                         matrix[i][j]=0;
                    }
                    
            }
        }

        
             for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                 System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}