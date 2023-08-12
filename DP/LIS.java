//longest increasing subsequence
public class LIS {
    public static void main(String[] args) {
        int elements [] = {55,4,11,9,33,200};
        int n = elements.length;
      int dp[]=new int[n];

      for(int i=0;i<n;i++){
           dp[i]=1;
      }
       int len=1;
      for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(elements[i]>elements[j]){
             dp[i]=Math.max(dp[i],1+dp[j]);
            len=Math.max(len,dp[i]);
            }
            
        }
      }
      System.out.println(len);
    }
}
