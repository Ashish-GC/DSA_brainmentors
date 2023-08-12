class gfg4144
{
    static int[][]  Mutliply(int[][] matrixA, int[][] matrixB)
    {
        int result[][]=new int[matrixA.length][matrixA[0].length];
        
        for(int i=0;i<matrixA.length;i++){
             for(int j=0;j<matrixA[i].length;j++){
                   for(int k=0;k<matrixB.length;k++){
                       result[i][j]+= matrixA[i][k]*matrixB[k][j] ;
                      
                   }
             }
        }
        return result;
    }
    public static void main(String[] args) {
        int matrixA[][]={
            {16 ,8, 14, 9 ,9},
{7 ,8 ,6 ,16 ,8},
{8 ,11, 1 ,4, 19},
{9 ,13, 3 ,4, 10},
{13, 17 ,12, 4, 13}
        };

        int matrixB[][]= {
            {8, 2 ,12 ,10, 18},
{14 ,15, 18 ,14, 10},
{7 ,13, 12, 5, 14},
{6 ,17 ,16, 9, 9},
{11 ,13, 7 ,17, 10},
        };

       int result[][]=  Mutliply(matrixA,matrixB);
        

       
        for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixA[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
