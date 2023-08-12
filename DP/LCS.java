public class LCS {
        // recursion
    static int lcs(String s1,String s2){
             
           if(s1.length()==0||s2.length()==0){
            return 0;
           }
               int count=0; 
        if(s1.charAt(0)==s2.charAt(0)){
            count=1+ lcs(s1.substring(1),s2.substring(1));
        }
         else{
                   int num1=lcs(s1, s2.substring(1));
                   int num2=lcs(s1.substring(1), s2);

                   count=Math.max(num1,num2);
           }
           return count;
    }
    // memorization
        static int lcsM(String s1,String s2,int m,int n,int [][]cache){
              
            if(m==0|| n==0){
                return 0;
            }
            
            if(cache[m-1][n-1]!=0){
                return cache[m-1][n-1];
            }
            if(s1.charAt(m-1)==s2.charAt(n-1)){
                cache[m-1][n-1]=1+lcsM(s1, s2, m-1, n-1, cache);
                return cache[m-1][n-1];
             }
             else{
                   int n1=lcsM(s1, s2, m, n-1, cache);
                   int n2=lcsM(s1, s2, m-1, n, cache);
                   cache[m-1][n-1]=Math.max(n1,n2);
                   return cache[m-1][n-1];
             }
        }

       //tabulation
      static int lcsT(String s1,String s2,int m,int n){
             int matrix[][]=new int[m+1][n+1];
             for(int i=0;i<=m;i++){
                for(int j=0;j<=n;j++){
                    if(i!=0 && j!=0){
                         if(s1.charAt(i-1)==s2.charAt(j-1)){
                              matrix[i][j]=1+matrix[i-1][j-1];
                         }
                         else{
                            matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
                         }
                      }
                }
             }

             return matrix[m][n];
       }
   
     public static void main(String[] args) {
        String s1="ABCDEIF";
        String s2="ACHEHF"; 
       System.out.println(lcs(s1,s2));

       int cache[][]=new int[s1.length()][s2.length()];
       System.out.println(lcsM(s1,s2,s1.length(),s2.length(),cache));

       System.out.println(lcsT(s1,s2,s1.length(),s2.length()));
     } 
}
