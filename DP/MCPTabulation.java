public class MCPTabulation {
    public static void main(String[] args) {
         int cost[][]={{2,0,6},{3,1,7},{4,5,9}};
         int result[][]=new int[cost.length][cost.length];
        result[0][0]= cost[0][0];

         for(int i=1;i<result.length;i++){
             result[i][0]=result[i-1][0]+cost[i][0];
         }

         for(int i=1;i<result.length;i++){
                  result[0][i]=result[0][i-1]+cost[0][i];
         }

         for(int i=1;i<result.length;i++){
            for(int j=1;j<result.length;j++){
                result[i][j]= cost[i][j]+ Math.min(result[i-1][j-1],Math.min(result[i-1][j],result[i][j-1]));
            }
         }
 System.out.println(result[result.length-1][result.length-1]);
    }
}
