public class MCP {
    static int mcp(int cost[][],int m,int n){
              if(m<0||n<0){
                return Integer.MAX_VALUE;
              }
              if(m==0&&n==0){
                return cost[m][n];
              }
              return cost[m][n]+Math.min(mcp(cost,m-1,n-1),Math.min(mcp(cost,m-1,n),mcp(cost,m,n-1)));
    }

    public static void main(String[] args) {
        int cost[][]={{2,0,6},{3,1,7},{4,5,9}};

      System.out.println( mcp(cost,cost.length-1,cost.length-1)); 

    }
}
