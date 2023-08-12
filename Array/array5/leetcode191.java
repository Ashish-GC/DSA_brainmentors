public class leetcode191 {
    // you need to treat n as an unsigned value
    static int hammingWeight(int n) {
      int count=0;

         while(n>0){
          if((n&1)==1){count++;};
           n=n/2;
         }
         return count;
    }
    public static void main(String[] args) {
      System.out.println(hammingWeight(11111111111111111111111111111101));
    }
}