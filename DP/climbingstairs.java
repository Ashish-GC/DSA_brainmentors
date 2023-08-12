 class climbingstairs {
           static int count=0;
        static int climb(int n,int m){
          
            if(m>n){
                return 0;
            }
            if(n==m){
              count=count+1;
                return 0;
            }
    
                   climb(n,m+1);
                   climb(n,m+2);
                   return count;
            }
            
        
      static  public int climbStairs(int n) {
             
             return climb(n,0);
                }

                public static void main(String[] args) {
                  
                     System.out.println(climbStairs(2));
                }
    }

