class Solution {
    public static int[] kWeakestRows(int[][] matrix, int k) {
        int soldiers[]=new int[matrix.length];
        int result[]=new int[k];
       

        for(int i=0;i<matrix.length;i++){
             int c=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    c++;
                }
            }
             soldiers[i]=c;
        }
               int min=Integer.MAX_VALUE;
               int index=0; int j=0;
               while(k!=0){
                   for(int i=0;i<matrix.length;i++){
                        if(min>soldiers[i]){
                                min=soldiers[i];
                                index=i;
                        }
                   }
                   result[j]=index;
                   soldiers[index]=Integer.MAX_VALUE;
                   min=Integer.MAX_VALUE;
                    j=j+1;
                    k--;
               }

        return result;
    }
    public static void main(String[] args) {
        int num[][]= {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int result[]=kWeakestRows(num,2);
        for(int element: result){
            System.out.print(element);
        }
    }
}