
 class Solution {
   static public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
         isPowerOfFour(n/2);
         return false;
       
       
    }
      public static void main(String[] args) {
          System.out.println(isPowerOfFour(16));  
        }
}