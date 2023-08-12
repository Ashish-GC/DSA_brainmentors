class power{

    
 static public long pow(int x,long num){
     int mod= (int)(Math.pow(10,9)+7);
      
      if(num==0){return 1;}
       long ans=pow(x,num/2);
       ans=ans*ans%mod;
        
        if(num%2==0){
            return ans;
        }
        return x*ans%mod;
    }

    // public static long pow(int x,long num,long sum){
    //  int mod= (int)(Math.pow(10,9)+7);
    //     if(num==0){
    //         return (sum%mod);
    //     }
    //   sum=sum*x%mod;
    //    return pow(x,num-1,sum);
    // }

    static int countGoodNumbers(long n) {
         long even=0;
         long odd=0;
        int mod=(int) (Math.pow(10,9)+7);

         if(n%2==0){
             even=n/2;
             odd=n/2;
         }
         else{
             even=(n+1)/2;
             odd=n-even;
         }
          
          long ev = pow(5,even);
          long pr =pow(4,odd);
             System.out.println(even);
             System.out.println(odd);
             long result =(ev*pr)%mod;

             return (int) result;
    }
   public static void main(String[] args) {
    System.out.println(countGoodNumbers(806166225460393));
    
   }
}

