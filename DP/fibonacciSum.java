class fibonaciSum{
    static int fib(int n){
        if(n<=1){
            return n;
        }
           return fib(n-1)+fib(n-2);
    }
    // using memorization = top down approach
    static int fibM(int n,int []cache){
           if(n<=1){
            return n;
           }
            if(cache[n]!=0){
                return cache[n];
            }
           int num1=fibM(n-1,cache);
           int num2=fibM(n-2,cache);
           int result=num1+num2;
           cache[n]=result;
            return result;
    }

    // tabulation = bottom up approach
         static int fibT(int n){
            int cache[]=new int[n];
            cache[0]=1;
            cache[1]=1;
              for(int i=2;i<n;i++){
                cache[i]=cache[i-1]+cache[i-2];
              }
              return cache[n-1];
         }
    public static void main(String[] args) {
      int n=15;

      System.out.println(fib(n));  

      int cache[]=new int[n+1];
      System.out.println(fibM(n,cache));

     System.out.println(fibT(n)); 
    }
}